package com.app.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.kotlintraining.databinding.ActivitySquareActivityBinding

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivitySquareActivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            if (binding.editSide.text.toString() == "") {
                Toast.makeText(this, "Please, enter side", Toast.LENGTH_SHORT).show()
            } else {
                val side : Double = binding.editSide.text.toString().toDouble()
                val areaResult : Double = side * side
                val perimeterResult : Double = 4 * side
                binding.textAreaResult.text = areaResult.toString()
                binding.textPerimeterResult.text = perimeterResult.toString()
            }
        }
    }
}