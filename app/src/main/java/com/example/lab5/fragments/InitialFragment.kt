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

class InitialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_initial, container, false)
        val layout = view.findViewById<LinearLayout>(R.id.card_layout)
        val button = view.findViewById<Button>(R.id.buttton_change)
        layout.setOnClickListener {
            // Cambiar a otro fragmento
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment())
                .addToBackStack(null)
                .commit()
        }

        button.setOnClickListener {
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}