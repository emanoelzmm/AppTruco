package br.edu.utfpr.avtruco

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Historico : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_historico)

        //variáveis recebidas da tela anterior
        val vitoriasJogador1 = intent.getIntExtra("vitoriasJogador1", 0)
        val vitoriasJogador2 = intent.getIntExtra("vitoriasJogador2", 0)

        // Exibir o numero de vitórios substituindo o textview
        val vitorias_jogador_1 = findViewById<TextView>(R.id.vitorias_jogador_1)
        vitorias_jogador_1.text = vitoriasJogador1.toString()
        val vitorias_jogador_2 = findViewById<TextView>(R.id.vitorias_jogador_2)
        vitorias_jogador_2.text = vitoriasJogador2.toString()

        // Faz a troca dos nomes, caso o usuário tenha mudado
        val nomeJogador1 = intent.getStringExtra("nomeJogador1")
        val nomeJogador2 = intent.getStringExtra("nomeJogador2")
        if (!nomeJogador1.isNullOrEmpty()) {
            findViewById<TextView>(R.id.h_jogador_1).text = nomeJogador1
        }
        if (!nomeJogador2.isNullOrEmpty()) {
            findViewById<TextView>(R.id.h_jogador_2).text = nomeJogador2
        }

    }
}