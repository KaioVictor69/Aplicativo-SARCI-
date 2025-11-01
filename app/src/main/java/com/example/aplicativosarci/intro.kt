package com.example.aplicativosarci


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativosarci.databinding.ActivityIntroBinding

class intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}