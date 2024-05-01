package com.example.myshoppingapplication.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.myshoppingapplication.R

/**
 * A simple [Fragment] subclass.
 * Use the [SettingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingsFragment : Fragment() {

//    private var _binding: FragmentSettingsBinding? = null
//    private val binding get() = com.example.myshoppingapplication._binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view =  inflater.inflate(R.layout.fragment_settings, container, false)

        val profileSettings = view.findViewById<CardView>(R.id.cvProfileSettings)
        val notification = view.findViewById<CardView>(R.id.cvNotifications)
        val appearance = view.findViewById<CardView>(R.id.cvAppearance)
        val security = view.findViewById<CardView>(R.id.cvPrivacySecurity)
        val help = view.findViewById<CardView>(R.id.cvHelp)
        val about = view.findViewById<CardView>(R.id.cvAbout)

        //Profile Settings functionality
        profileSettings.setOnClickListener {
            Toast.makeText(context, "Profile Settings", Toast.LENGTH_SHORT).show()
        }

        //Notifications Settings functionality
        notification.setOnClickListener {
            Toast.makeText(context, "Notifications", Toast.LENGTH_SHORT).show()
        }

        //Appearance Settings functionality
        appearance.setOnClickListener {
            Toast.makeText(context, "Appearance Clicked", Toast.LENGTH_SHORT).show()
        }

        //Security Settings functionality
        security.setOnClickListener {
            Toast.makeText(context, "Security Clicked!", Toast.LENGTH_SHORT).show()
        }
        //Help Settings functionality
        help.setOnClickListener {
            Toast.makeText(context, "Help clicked", Toast.LENGTH_SHORT).show()
        }

        //About Settings functionality
        about.setOnClickListener {
            Toast.makeText(context, "About Clicked!", Toast.LENGTH_SHORT).show()
        }



        // Inflate the layout for this fragment
        return view
    }
}