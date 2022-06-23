package com.app.kotlintraining

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.kotlintraining.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.enfjButton.setOnClickListener(this)
        binding.enfpButton.setOnClickListener(this)
        binding.entpButton.setOnClickListener(this)
        binding.entjButton.setOnClickListener(this)
        binding.esfjButton.setOnClickListener(this)
        binding.esfpButton.setOnClickListener(this)
        binding.estjButton.setOnClickListener(this)
        binding.estpButton.setOnClickListener(this)
        binding.infjButton.setOnClickListener(this)
        binding.infpButton.setOnClickListener(this)
        binding.intjButton.setOnClickListener(this)
        binding.intpButton.setOnClickListener(this)
        binding.isfjButton.setOnClickListener(this)
        binding.isfpButton.setOnClickListener(this)
        binding.istjButton.setOnClickListener(this)
        binding.istpButton.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.enfj_button -> {
                val intent = Intent(this, EnfjActivity::class.java)
                startActivity(intent)
            }
            R.id.enfp_button -> {
                val intent = Intent(this, EnfpActivity::class.java)
                startActivity(intent)
            }
            R.id.entj_button -> {
                val intent = Intent(this, EntjActivity::class.java)
                startActivity(intent)
            }
            R.id.entp_button -> {
                val intent = Intent(this, EntpActivity::class.java)
                startActivity(intent)
            }
            R.id.esfj_button -> {
                val intent = Intent(this, EsfjActivity::class.java)
                startActivity(intent)
            }
            R.id.esfp_button -> {
                val intent = Intent(this, EsfpActivity::class.java)
                startActivity(intent)
            }
            R.id.estj_button -> {
                val intent = Intent(this, EstjActivity::class.java)
                startActivity(intent)
            }
            R.id.estp_button -> {
                val intent = Intent(this, EstpActivity::class.java)
                startActivity(intent)
            }
            R.id.infj_button -> {
                val intent = Intent(this, InfjActivity::class.java)
                startActivity(intent)
            }
            R.id.infp_button -> {
                val intent = Intent(this, InfpActivity::class.java)
                startActivity(intent)
            }
            R.id.intj_button -> {
                val intent = Intent(this, IntjActivity::class.java)
                startActivity(intent)
            }
            R.id.intp_button -> {
                val intent = Intent(this, IntpActivity::class.java)
                startActivity(intent)
            }
            R.id.isfj_button -> {
                val intent = Intent(this, IsfjActivity::class.java)
                startActivity(intent)
            }
            R.id.isfp_button -> {
                val intent = Intent(this, IsfpActivity::class.java)
                startActivity(intent)
            }
            R.id.istj_button -> {
                val intent = Intent(this, IstjActivity::class.java)
                startActivity(intent)
            }
            R.id.istp_button -> {
                val intent = Intent(this, IstpActivity::class.java)
                startActivity(intent)
            }

            else -> {
                Toast.makeText(this, "NO OPTION", Toast.LENGTH_SHORT).show()
            }
        }
    }
}