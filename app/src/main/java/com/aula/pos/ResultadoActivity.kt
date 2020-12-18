package com.aula.pos

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        setSupportActionBar(findViewById(R.id.toolbar))


        val gasolina = intent?.getStringExtra("gasolina")?.toDoubleOrNull()
        val alcool = intent?.getStringExtra("alcool")?.toDoubleOrNull()

        if (gasolina != null && alcool != null) {
            val comparacao = gasolina * 0.7
            if (comparacao > alcool) {
                resultadoCombust.text = "Alcool"
            } else {
                resultadoCombust.text = "Gasolina"
            }
        } else {
            resultadoCombust.text = "Sem Resultado"
        }
    }
}