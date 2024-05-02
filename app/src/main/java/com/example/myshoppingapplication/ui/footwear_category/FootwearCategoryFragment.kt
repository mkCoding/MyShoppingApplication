package com.example.myshoppingapplication.ui.footwear_category

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.myshoppingapplication.R
import com.example.myshoppingapplication.databinding.FragmentFootwearCategoryBinding
import com.example.myshoppingapplication.databinding.FragmentHomeBinding
import com.example.myshoppingapplication.ui.home.HomeViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [FootwearCategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FootwearCategoryFragment : Fragment() {
    var _binding:FragmentFootwearCategoryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val footwearCategoryViewModel = ViewModelProvider(this).get(FootwearCategoryViewModel::class.java)

        _binding = FragmentFootwearCategoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tvFragShow

        footwearCategoryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
            Log.d("FootwearCategoryFragement",textView.text.toString())
        }
        // Inflate the layout for this fragment
        return root
    }

}