package com.example.myshoppingapplication.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//Extending functionalities from Model


//the view model holds live data that will be observed in my fragment (ClothingCategoryFragment)
class ClothingCategoryViewModel : ViewModel(){

    private val _dataList = MutableLiveData<List<String>>()
    val dataList: LiveData<List<String>> = _dataList

    // Filtered list
    private val _filteredDataList = MutableLiveData<List<String>>()
    val filteredDataList: LiveData<List<String>> = _filteredDataList //create filtered list that will hold filtered data as user adds input

    init {
        // Simulate data loading
        loadDummyData()
    }

    private fun loadDummyData() {
        val dummyData = listOf( "Blue Striped Button-Up Shirt", "White Graphic T-shirt", "Black V-neck Sweater", "Pink Crop Top",
            "Black Leggings","Polka Dot Wrap Dress", "Leather Jacket","Yoga Pants",
            "Floral Maxi Dress", "Trench Coat", "Bikini", "One-Piece Swimsuit", "Swim Cover-Up") // Your data list
        _dataList.value = dummyData

    }

    fun filterData(newText: String?){
        val originalList = _dataList.value ?: emptyList()
        //only return elements when query is not null or if its blank
        //also added functionality so that user can enter in any case letters and results still show up
        _filteredDataList.value = originalList.filter { it.toLowerCase().contains(newText.orEmpty().toLowerCase()) }
    }

}