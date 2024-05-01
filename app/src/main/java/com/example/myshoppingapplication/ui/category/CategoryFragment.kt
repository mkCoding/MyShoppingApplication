package com.example.myshoppingapplication.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.myshoppingapplication.R
import com.example.myshoppingapplication.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {

    private var _binding:FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)

        val root:View = binding.root

        val clothingCardView:CardView = binding.cvClothing
        clothingCardView.setOnClickListener {
            //move to next screen
            findNavController().navigate(R.id.action_nav_category_to_clothingCategoryFragment)
        }
        // Inflate the layout for this fragment
        return root
    }

}