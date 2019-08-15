package com.example.helloword

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.result10 as result11


class MainActivity : AppCompatActivity() {

    var resultado1 = 0
    var resultado2 = 0
    var resultado3 = 0

    val CODE1 = 1
    val CODE2 = 2
    val CODE3 = 3

    val RESULTESTE1 = 99
    val RESULTESTE2 = 98
    val RESULTESTE3 = 97

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result2.text = "$resultado2"
        result3.text = "$resultado3"
        result11.text = "$resultado1"

    }

    fun click(v:View){

        var i = Intent(this, TesteDaltonismo::class.java)
        var cod = 0;

        when(v.id){

            R.id.teste1button -> {
                cod=CODE1
            }

            R.id.teste2button -> {
                cod = CODE2
            }

            R.id.teste3button -> {
                cod = CODE3
            }
        }

        var b = Bundle()
        b.putInt("codImagem",cod)
        i.putExtras(b)
        startActivity(i)

    }


}
