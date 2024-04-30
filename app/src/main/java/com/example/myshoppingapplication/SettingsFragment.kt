package com.example.myshoppingapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SettingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_settings, container, false)

        val profile_settings = view.findViewById<CardView>(R.id.cvProfileSettings)
        val notification = view.findViewById<CardView>(R.id.cvNotifications)
        val appearance = view.findViewById<CardView>(R.id.cvAppearance)
        val security = view.findViewById<CardView>(R.id.cvPrivacySecurity)
        val help = view.findViewById<CardView>(R.id.cvHelp)
        val about = view.findViewById<CardView>(R.id.cvAbout)

        profile_settings.setOnClickListener {
            Toast.makeText(context,"Profile Settings",Toast.LENGTH_LONG).show()
        }

        notification.setOnClickListener {
            Toast.makeText(context,"Notifications",Toast.LENGTH_LONG).show()
        }

        appearance.setOnClickListener {
            Toast.makeText(context,"Appearance Clicked",Toast.LENGTH_LONG).show()
        }
        security.setOnClickListener {
            Toast.makeText(context,"Security Clicked!",Toast.LENGTH_LONG).show()
        }

        help.setOnClickListener {
            Toast.makeText(context,"Help clicked",Toast.LENGTH_LONG).show()
        }

        about.setOnClickListener {
            Toast.makeText(context,"About Clicked!",Toast.LENGTH_LONG).show()
        }




        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SettingsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SettingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}