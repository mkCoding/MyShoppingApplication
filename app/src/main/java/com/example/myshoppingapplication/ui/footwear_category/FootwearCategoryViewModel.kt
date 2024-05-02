package com.example.myshoppingapplication.ui.footwear_category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myshoppingapplication.data.api.RetrofitInstance
import kotlinx.coroutines.launch

class FootwearCategoryViewModel:ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "This is Footwear Fragment"
    }
    val text: LiveData<String> = _text

    init{
        getProductDetails()
    }

    private fun getProductDetails() {

        viewModelScope.launch {
            val result = RetrofitInstance.apiClient2.getShoppingItems()

            if(!result.description.isNullOrEmpty()){
                _text.postValue(result.description)
            }

        }
    }


}