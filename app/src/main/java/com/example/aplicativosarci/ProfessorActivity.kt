package com.example.aplicativosarci

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplicativosarci.databinding.ActivityAlunoBinding
import com.example.aplicativosarci.databinding.ActivityProfessorBinding

class ProfessorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  binding = ActivityProfessorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<Button>(R.id.btnListar)

        btnNext.setOnClickListener {
            val intent = Intent(this, Disciplinas::class.java)
            startActivity(intent)
        }

        val btnNext2 = findViewById<ImageButton>(R.id.btnConfig)

        btnNext.setOnClickListener {
            val intent = Intent(this, ConfigActivity::class.java)
            startActivity(intent)
        }

        val btnNext3 = findViewById<ImageButton>(R.id.btnVoltarDisciplina)

        btnNext.setOnClickListener {
            val intent = Intent(this, AlunoActivity::class.java)
            startActivity(intent)
        }

        val btnNext4 = findViewById<ImageButton>(R.id.btnVoltarConfig)

        btnNext.setOnClickListener {
            val intent = Intent(this, ProfessorActivity::class.java)
            startActivity(intent)
        }

    }
}