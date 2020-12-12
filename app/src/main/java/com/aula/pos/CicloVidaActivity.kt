package com.aula.pos

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_ciclo_vida.*

const val CATEGORIA = "AULA"


class CicloDeVida : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        setSupportActionBar(toolbar)

        Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + savedInstanceState);

        val t = TextView(this)
        t.text = "Exemplo do ciclo de vida.\nConsulte os logs no LogCat."
        setContentView(t)
    }

    override fun onStart() {
        super.onStart()
        Log.i(CATEGORIA, getClassName() + ".onStart() chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(CATEGORIA, getClassName() + ".onRestart() chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.i(CATEGORIA, getClassName() + ".onResume() chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.i(CATEGORIA, getClassName() + ".onPause() chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.i(CATEGORIA, getClassName() + ".onStop() chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado.")
    }

    private fun getClassName(): String {
        val s = javaClass.name
        return s.substring(s.lastIndexOf("."))
    }
}