package br.edu.utfpr.avtruco

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.edu.utfpr.avtruco.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private var vitoriasJogador1 = 0

    fun mais_um_pontos_jogador_1(view: View) {
        val pontos = binding.pontosJogador1.text.toString().toInt()
        if ((pontos + 1) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador1++
            val toast = Toast.makeText(this, "${binding.jogador1.text.removeSuffix(":")} ganhou - $vitoriasJogador1 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador1.text = (pontos + 1).toString()
        }
    }

    fun mais_tres_pontos_jogador_1(view: View) {
        val pontos = binding.pontosJogador1.text.toString().toInt()
        if ((pontos + 3) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador1++
            val toast = Toast.makeText(this, "${binding.jogador1.text.removeSuffix(":")} ganhou - $vitoriasJogador1 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador1.text = (pontos + 3).toString()
        }
    }

    fun mais_seis_pontos_jogador_1(view: View) {
        val pontos = binding.pontosJogador1.text.toString().toInt()
        if ((pontos + 6) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador1++
            val toast = Toast.makeText(this, "${binding.jogador1.text.removeSuffix(":")} ganhou - $vitoriasJogador1 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador1.text = (pontos + 6).toString()
        }
    }

    fun mais_nove_pontos_jogador_1(view: View) {
        val pontos = binding.pontosJogador1.text.toString().toInt()
        if ((pontos + 9) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador1++
            val toast = Toast.makeText(this, "${binding.jogador1.text.removeSuffix(":")} ganhou - $vitoriasJogador1 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador1.text = (pontos + 9).toString()
        }
    }

    fun mais_doze_pontos_jogador_1(view: View) {
        binding.pontosJogador1.text = "0"
        binding.pontosJogador2.text = "0"
        vitoriasJogador1++
        val toast = Toast.makeText(this, "${binding.jogador1.text.removeSuffix(":")} ganhou - $vitoriasJogador1 vitória(s)", Toast.LENGTH_SHORT)
        toast.show()
    }

    //------------------- Jogador 2 -------------------

    private var vitoriasJogador2 = 0

    fun mais_um_pontos_jogador_2(view: View) {
        val pontos = binding.pontosJogador2.text.toString().toInt()
        if ((pontos + 1) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador2++
            val toast = Toast.makeText(this, "${binding.jogador2.text.removeSuffix(":")} ganhou - $vitoriasJogador2 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador2.text = (pontos + 1).toString()
        }
    }

    fun mais_tres_pontos_jogador_2(view: View) {
        val pontos = binding.pontosJogador2.text.toString().toInt()
        if ((pontos + 3) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador2++
            val toast = Toast.makeText(this, "${binding.jogador2.text.removeSuffix(":")} ganhou - $vitoriasJogador2 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador2.text = (pontos + 3).toString()
        }
    }

    fun mais_seis_pontos_jogador_2(view: View) {
        val pontos = binding.pontosJogador2.text.toString().toInt()
        if ((pontos + 6) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador2++
            val toast = Toast.makeText(this, "${binding.jogador2.text.removeSuffix(":")} ganhou - $vitoriasJogador2 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador2.text = (pontos + 6).toString()
        }
    }

    fun mais_nove_pontos_jogador_2(view: View) {
        val pontos = binding.pontosJogador2.text.toString().toInt()
        if ((pontos + 9) >= 12) {
            binding.pontosJogador1.text = "0"
            binding.pontosJogador2.text = "0"
            vitoriasJogador2++
            val toast = Toast.makeText(this, "${binding.jogador2.text.removeSuffix(":")} ganhou - $vitoriasJogador2 vitória(s)", Toast.LENGTH_SHORT)
            toast.show()
            return
        } else {
            binding.pontosJogador2.text = (pontos + 9).toString()
        }
    }

    fun mais_doze_pontos_jogador_2(view: View) {
        binding.pontosJogador1.text = "0"
        binding.pontosJogador2.text = "0"
        vitoriasJogador2++
        val toast = Toast.makeText(this, "${binding.jogador2.text.removeSuffix(":")} ganhou - $vitoriasJogador2 vitória(s)", Toast.LENGTH_SHORT)
        toast.show()
    }

    //botão vai abrir outra tela passando o histórico de vitórias
    fun abrir_historico_jogadas(view: View) {
        val intent = Intent(this, Historico::class.java)
        intent.putExtra("vitoriasJogador1", vitoriasJogador1)
        intent.putExtra("vitoriasJogador2", vitoriasJogador2)
        intent.putExtra("nomeJogador1", binding.jogador1.text.toString())
        intent.putExtra("nomeJogador2", binding.jogador2.text.toString())
        startActivity(intent)
    }

    fun zerar_historico(view: View) {
        binding.pontosJogador1.text = "0"
        binding.pontosJogador2.text = "0"
        vitoriasJogador1 = 0
        vitoriasJogador2 = 0
        val toast = Toast.makeText(this, "Histórico de vitórias zerado!", Toast.LENGTH_SHORT)
        toast.show()
    }

    //Abrir a tela para informar os nomes dos jogadores
    fun informar_nomes(view: View) {
        val intent = Intent(this, Nomes::class.java)
        startActivity(intent)
    }

    //muda os nomes com base no que foi recebido da tela nomes
    override fun onResume() {
        super.onResume()
        val nomeJ1 = intent.getStringExtra("nomeJogador1")
        val nomeJ2 = intent.getStringExtra("nomeJogador2")
        if (!nomeJ1.isNullOrEmpty()) {
            binding.jogador1.text = nomeJ1 + ":"
        }
        if (!nomeJ2.isNullOrEmpty()) {
            binding.jogador2.text = nomeJ2 + ":"
        }
    }




}