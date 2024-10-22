package com.example.lab5.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.lab5.R

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val layout = view.findViewById<RelativeLayout>(R.id.card_layout1)
        layout.setOnClickListener {
            // Cambiar a otro fragmento
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment())
                .addToBackStack(null)
                .commit()
        }
        return view
    }


}