package com.example.daloft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daloft.ui.theme.DaloftTheme
import soup.neumorphism.NeumorphCardView

import android.graphics.drawable.GradientDrawable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.daloft.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.menubutton?.setOnClickListener {
            if (binding.buttonCard?.visibility == View.VISIBLE) {
                binding.buttonCard?.visibility = View.GONE
                binding.menubutton!!.setImageResource(R.drawable.menu_on)

            } else {
                binding.buttonCard!!.visibility = View.VISIBLE
                binding.menubutton!!.setImageResource(R.drawable.menu_off)
            }
        }

        binding.menubutton2?.setOnClickListener {
            if (binding.buttonCard2?.visibility == View.VISIBLE) {
                binding.buttonCard2?.visibility = View.GONE
                binding.menubutton2!!.setImageResource(R.drawable.menu_on)

            } else {
                binding.buttonCard2!!.visibility = View.VISIBLE
                binding.menubutton2!!.setImageResource(R.drawable.menu_off)
            }
        }


    }

    private fun createTrapezoidShape(): GradientDrawable {
        return GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            setColor(resources.getColor(R.color.teal_200, null)) // Set the color you want
            cornerRadii = floatArrayOf(3f, 3f, 3f, 3f, 5f, 5f, 5f, 5f)
            setSize(2, 70) // Set the size you want
        }
    }
}