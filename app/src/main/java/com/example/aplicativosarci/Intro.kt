package com.example.aplicativosarci


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativosarci.databinding.ActivityIntroBinding

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<Button>(R.id.btnLogin)

        btnNext.setOnClickListener {
            val intent = Intent(this, DiscenteDocenteActivity::class.java)
            startActivity(intent)
        }


    }
}

