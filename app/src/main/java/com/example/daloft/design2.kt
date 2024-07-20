package com.example.daloft

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.daloft.databinding.ActivityDesign2Binding


class design2 : AppCompatActivity() {
    lateinit var binding: ActivityDesign2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesign2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle menubutton click
        binding.menubutton?.setOnClickListener {

            if (binding.buttonCard?.visibility == View.VISIBLE) {
                binding.buttonCard?.visibility = View.GONE
                binding.menubutton!!.setImageResource(R.drawable.ic_right_arrow)
            } else {
                binding.buttonCard!!.visibility = View.VISIBLE
                binding.menubutton!!.setImageResource(R.drawable.ic_left_arrow)
            }
        }

        // Handle menubutton2 click

        toggleButton2TintOnClick(binding.bList as ImageButton, "#902484E4", "#983873ed")
        toggleButton2TintOnClick(binding.bConnect as ImageButton, "#90F44336", "#983873ed")
        toggleButton2TintOnClick(binding.startButton as ImageButton, "#9012E40B", "#983873ed")
        toggleButton2TintOnClick(binding.startWp as ImageButton, "#6CF03B", "#983873ed")
        toggleButton2TintOnClick(binding.missionStart as ImageButton, "#90F84436", "#983873ed")
        toggleButton2TintOnClick(binding.autopilot as ImageButton, "#31C8AB", "#983873ed")
    }
}


fun toggleButton2TintOnClick(imageButton: ImageButton, color1: String, color2: String) {
    var isDefaultColor = true
    val defaultTintColor = Color.parseColor(color1)
    val newTintColor = Color.parseColor(color2)

    // Set initial background tint
    imageButton.backgroundTintList = ColorStateList.valueOf(defaultTintColor)

    imageButton.setOnClickListener {
        if (isDefaultColor) {
            imageButton.backgroundTintList = ColorStateList.valueOf(newTintColor)
        } else {
            imageButton.backgroundTintList = ColorStateList.valueOf(defaultTintColor)
        }
        isDefaultColor = !isDefaultColor
    }
}



