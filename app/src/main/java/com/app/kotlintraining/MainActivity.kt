package com.app.kotlintraining

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.kotlintraining.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCircle.setOnClickListener(this)
        binding.buttonSquare.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button_circle -> {
                val intent = Intent(this, CircleActivity::class.java)
                startActivity(intent)
            }
            R.id.button_square -> {
                val intent = Intent(this, SquareActivity::class.java)
                startActivity(intent)
            }
        }

    }
}