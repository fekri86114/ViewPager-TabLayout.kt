package com.app.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.kotlintraining.databinding.ActivityCircleBinding

class CircleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityCircleBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {

            if (binding.editRadius.text.toString() == "") {
                Toast.makeText(this, "Please, enter radius", Toast.LENGTH_SHORT).show()
            } else {

                val radius : Double = binding.editRadius.text.toString().toDouble()
                val areaResult : Double = 3.14 * (radius * radius)
                val perimeterResult : Double = 2 * 3.14 * radius
                binding.textAreaResult.text = areaResult.toString()
                binding.textPerimeterResult.text = perimeterResult.toString()

            }

        }
    }
}