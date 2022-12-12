package com.example.sorteado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sorter : Button = findViewById(R.id.button_sortear)
        sorter.setOnClickListener { sorterNumerous() }

        val reset : Button = findViewById(R.id.button_resetar)
        reset.setOnClickListener { resetNumerous() }
    }
    private fun sorterNumerous() {
        val numberInitial: EditText = findViewById(R.id.edit_digite_numero)
        val result : TextView = findViewById(R.id.text_resultado)
        val initial = Integer.parseInt(numberInitial.text.toString())
        val sorted = Random.nextInt(0, initial) +1
        "Número sorteado foi: $sorted".also { result.text = it }
    }

    private fun resetNumerous(){
        val numberInitial: EditText = findViewById(R.id.edit_digite_numero)
        numberInitial.text.clear()
        val result : TextView = findViewById(R.id.text_resultado)
        "Nenhum número selecionado: ".also { result.text = it }
    }

}