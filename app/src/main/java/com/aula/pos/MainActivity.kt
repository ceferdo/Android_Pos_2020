package com.aula.pos

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculo.setOnClickListener{

            val gasolina = (valorGasolina.text.toString()).toDouble()
            val alcool = (valorAlcool.text.toString()).toDouble()

            val calculo = gasolina * 0.7

            if (calculo > alcool) {
                resultado.text = "Alcool é melhor"
            } else {
                resultado.text = "Gasolina é melhor"
            }

            Toast.makeText(this@MainActivity, "Apertei o login", Toast.LENGTH_LONG).show();
            Log.i("Mobile" , "Cliquei no botão");
        }
    }
}