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
import com.example.aplicativosarci.databinding.ActivityNotificacoesBinding
import com.example.aplicativosarci.databinding.ActivityProfessorBinding

class NotificacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  binding = ActivityNotificacoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<ImageButton>(R.id.btnVoltar)

        btnNext.setOnClickListener {
            val intent = Intent(this, AlunoActivity::class.java)
            startActivity(intent)
        }
    }
}