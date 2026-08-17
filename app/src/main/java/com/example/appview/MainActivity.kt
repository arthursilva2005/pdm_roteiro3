package com.example.appview

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bt: Button = findViewById(R.id.button)
        val edT: EditText = findViewById(R.id.editTextText2)
        val edT2: EditText = findViewById(R.id.editTextText3)
        val resp: TextView = findViewById(R.id.textView8)
        val img: ImageView = findViewById(R.id.imageView)

        val usuarioCorreto = "Arthur"
        val senhaCorreta = "1234"

        bt.setOnClickListener {

            val nome: String = edT.text.toString()
            val senha: String = edT2.text.toString()

            if (nome == usuarioCorreto && senha == senhaCorreta) {

                resp.text = "Olá, $nome!"
                img.setImageResource(R.drawable.certo)

            } else {

                resp.text = "Usuário ou senha incorretos!"
                img.setImageResource(R.drawable.errado)

            }
        }
    }
}