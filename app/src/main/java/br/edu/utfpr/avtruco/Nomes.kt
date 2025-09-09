package br.edu.utfpr.avtruco

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Nomes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nomes)
    }

    fun confirmar_nomes(view: View) {
        val nomeJ1 = findViewById<EditText>(R.id.et_nome_jogador_1).text.toString()
        val nomeJ2 = findViewById<EditText>(R.id.et_nome_jogador_2).text.toString()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("nomeJogador1", nomeJ1)
        intent.putExtra("nomeJogador2", nomeJ2)
        startActivity(intent)
    }
}