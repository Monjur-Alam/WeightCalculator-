package com.example.weightcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.weightcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var dw: Double = 0.0
    private var lw: Double = 0.0
    private var los: Double = 0.0
    private var result: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
            binding.calculate.setOnClickListener {
            dw = binding.dw.text.toString().toDouble()
            lw = binding.lw.text.toString().toDouble()
            los = binding.los.text.toString().toDouble()
            result = ((dw - lw) / (lw * los)) / 1000
            binding.result.text = result.toString()
        }
    }
}
