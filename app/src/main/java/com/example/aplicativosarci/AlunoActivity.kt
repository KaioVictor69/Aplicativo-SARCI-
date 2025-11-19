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
import com.example.aplicativosarci.databinding.ActivityDiscenteDocenteBinding

class AlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  binding = ActivityAlunoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<Button>(R.id.btnNotificacoes)

        btnNext.setOnClickListener {
            val intent = Intent(this, NotificacoesActivity::class.java)
            startActivity(intent)
        }

        val btnNext2 = findViewById<Button>(R.id.btnNotificacoes)

        btnNext.setOnClickListener {
            val intent = Intent(this, Disciplinas::class.java)
            startActivity(intent)
        }

        val btnNext3 = findViewById<ImageButton>(R.id.btnConfig)

        btnNext.setOnClickListener {
            val intent = Intent(this, ConfigActivity::class.java)
            startActivity(intent)
        }
    }
}