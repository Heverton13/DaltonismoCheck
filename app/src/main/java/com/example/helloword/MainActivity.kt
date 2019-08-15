package com.example.helloword

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.result10 as result11


class MainActivity : AppCompatActivity() {

    var resultado1:Int = 0
    var resultado2:Int = 0
    var resultado3:Int = 0

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

        verificarButton.setOnClickListener {

            if(result11.text.toString().toInt() == 2 &&
                result2.text.toString().toInt() == 74 &&
                result3.text.toString().toInt() == 57)
            {
                resultfinal.text = "Você não é daltônico"
            }

            else if(result11.text.toString().toInt() == 0 ||
                result2.text.toString().toInt() == 0 ||
                result3.text.toString().toInt() == 0)
            {
                Toast.makeText(getApplicationContext(), "Por favor, Realize todos os testes",
                    Toast.LENGTH_SHORT).show();
            }else{
                resultfinal.text = "Você é daltônico, Procure um médico"
            }

        }

    }

    fun click(v:View){

        var i = Intent(this, TesteDaltonismo::class.java)
        var cod = 0;
        var resultado = 0;

        when(v.id){

            R.id.teste1button -> {
                cod=CODE1
                resultado = RESULTESTE1
            }

            R.id.teste2button -> {
                cod = CODE2
                resultado = RESULTESTE2
            }

            R.id.teste3button -> {
                cod = CODE3
                resultado = RESULTESTE3
            }
        }

        var b = Bundle()
        b.putInt("codImagem",cod)
        i.putExtras(b)
        startActivityForResult(i,resultado)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val t = data?.getStringExtra("RESULTADOFINAL")


        when(requestCode){
            RESULTESTE1 -> {
                when (resultCode) {
                    Activity.RESULT_OK -> {
                        result11.text = t
                    }
                }
            }
        }

        when(requestCode){
            RESULTESTE2 -> {
                when (resultCode) {
                    Activity.RESULT_OK -> {
                        result2.text = t
                    }
                }
            }
        }

        when(requestCode){
            RESULTESTE3 -> {
                when (resultCode) {
                    Activity.RESULT_OK -> {
                        result3.text = t
                    }
                }
            }
        }

    }


}
