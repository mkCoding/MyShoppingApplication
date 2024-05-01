package com.example.myshoppingapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.myshoppingapplication.databinding.FragmentCategoryBinding
import com.example.myshoppingapplication.databinding.FragmentClothingCategoryBinding
import com.example.myshoppingapplication.ui.ClothingCategoryViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [ClothingCategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ClothingCategoryFragment : Fragment() {

    private lateinit var binding: FragmentClothingCategoryBinding
    private lateinit var adapter:ArrayAdapter<String>
    lateinit var viewModel:ClothingCategoryViewModel

//    private val dataList = listOf(
//        "Blue Striped Button-Up Shirt", "White Graphic T-shirt", "Black V-neck Sweater", "Pink Crop Top",
//        "Black Leggings","Polka Dot Wrap Dress", "Leather Jacket","Yoga Pants",
//        "Floral Maxi Dress", "Trench Coat", "Bikini", "One-Piece Swimsuit", "Swim Cover-Up")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize bindinv variable so that layoutview references are easier to access
        binding = FragmentClothingCategoryBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[ClothingCategoryViewModel::class.java]

        //initialize the array adapter
        adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1)

        //link the list view with the adapter so it understands the list that we are tying to the code
        binding.lvClothingProducts.adapter = adapter

        //this will observe the origin list pulled from ClothingCategoryViewModel
        viewModel.dataList.observe(viewLifecycleOwner) { data ->
            adapter.clear()
            adapter.addAll(data) //add data from origin list to adapter (this is obtained from view model)

        }

        //this will Observe the filtered clothing list from ClothingCategoryViewModel
        viewModel.filteredDataList.observe(viewLifecycleOwner) { filteredData ->
            // Update the adapter with the filtered data
            adapter.clear()
            adapter.addAll(filteredData) //add data from filtered list to adapter
        }

        //this will handle the textListener and query text change
        binding.svSearchAllProducts.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            //when the text is changed update/filter the list
            override fun onQueryTextChange(newText: String?): Boolean {
//                adapter.filter.filter(newText.orEmpty())
                viewModel.filterData(newText) //when this method is hit use viewModel to filter data
                return true
            }
        })

    }


}