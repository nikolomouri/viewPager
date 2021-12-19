package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class FragmentThree:Fragment(R.layout.fragment_three) {

    private lateinit var imageView3 :ImageView
    private lateinit var imageView4 :ImageView
    private lateinit var imageButton1 : Button
    private lateinit var imageButton2 : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView3= view.findViewById(R.id.iV3)
        imageView4 = view.findViewById(R.id.iV4)
        imageButton1 = view.findViewById(R.id.fIB)
        imageButton2 = view.findViewById(R.id.sIB)

        imageButton1.setOnClickListener {
            when(imageView3.visibility) {
                View.INVISIBLE -> imageView3.visibility = View.VISIBLE
                View.VISIBLE ->  imageView3.visibility = View.INVISIBLE
                else ->  imageView3.visibility = View.VISIBLE
            }
        }
        imageButton2.setOnClickListener {
            when(imageView4.visibility){
                View.INVISIBLE -> imageView4.visibility = View.VISIBLE
                View.VISIBLE ->  imageView4.visibility = View.INVISIBLE
                else ->  imageView4.visibility = View.VISIBLE
            }
        }
    }
}