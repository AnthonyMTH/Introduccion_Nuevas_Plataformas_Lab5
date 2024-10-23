package com.example.lab5.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.lab5.MainActivity
import com.example.lab5.R
import com.example.lab5.SecondActivity

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val card1 = view.findViewById<RelativeLayout>(R.id.card_layout1)
        val card2 = view.findViewById<RelativeLayout>(R.id.card_layout2)
        val button = view.findViewById<Button>(R.id.buttton_change)

        card1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment())
                .addToBackStack(null)
                .commit()
        }
        // en este caso muestran el mismo fragment pero lo normal seria que muestren fragments distintos
        card2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment())
                .addToBackStack(null)
                .commit()
        }

        button.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }


}