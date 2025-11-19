package com.example.aplicativosarci

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativosarci.databinding.ActivityDiscenteDocenteBinding
import com.example.aplicativosarci.databinding.ActivityIntroBinding
import com.example.aplicativosarci.databinding.ActivityProfessorBinding

class DiscenteDocenteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  binding = ActivityDiscenteDocenteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<ImageButton>(R.id.btnDocente)

        btnNext.setOnClickListener {
            val intent = Intent(this, AlunoActivity::class.java)
            startActivity(intent)
        }

        val btnNext2 = findViewById<ImageButton>(R.id.btnDiscente)

        btnNext2.setOnClickListener {
            val intent = Intent(this, ProfessorActivity::class.java)
            startActivity(intent)
        }



        val btnNext3 = findViewById<ImageButton>(R.id.btnVoltarDD)

        btnNext.setOnClickListener {
            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
        }
    }
}