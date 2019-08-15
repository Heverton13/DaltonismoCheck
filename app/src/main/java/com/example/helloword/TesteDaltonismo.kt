package com.example.helloword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_teste_daltonismo.*

class TesteDaltonismo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_daltonismo)

        var params = intent.extras
        var codigo = params?.getInt("codImagem")

        when(codigo){
            1 -> {
                imagem.setImageResource(R.drawable.img1)
            }

            2 -> {
                imagem.setImageResource(R.drawable.img2)
            }

            3 -> {
                imagem.setImageResource(R.drawable.img3)
            }
        }

        btCancelar.setOnClickListener {
            finish()
        }

    }
}
