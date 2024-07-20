package com.example.daloft

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.daloft.databinding.ActivityDesign2Binding
import com.example.daloft.databinding.ActivityDesign2ExtraBinding

class design2Extra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityDesign2ExtraBinding

            super.onCreate(savedInstanceState)
            binding = ActivityDesign2ExtraBinding.inflate(layoutInflater)
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