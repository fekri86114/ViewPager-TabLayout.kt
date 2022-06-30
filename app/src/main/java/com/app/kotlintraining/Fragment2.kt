package com.app.kotlintraining

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.kotlintraining.databinding.Fragment1Binding
import com.app.kotlintraining.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    lateinit var binding : Fragment2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = Fragment2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }
}