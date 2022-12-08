package com.example.sorteado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sortear : Button = findViewById(R.id.button_sortear)
        sortear.setOnClickListener { SortearNumeros() }

        val reset : Button = findViewById(R.id.button_resetar)
        reset.setOnClickListener { ResetarNumeros() }
    }
    private fun SortearNumeros() {
        val numero_inicial: EditText = findViewById(R.id.edit_digite_numero)
        val resultado : TextView = findViewById(R.id.text_resultado)
        val inicial = Integer.parseInt(numero_inicial.getText().toString())
        val sorteador = nextInt(0, inicial) +1
        resultado.text = "Número sorteado foi: " + sorteador
        resultado.contentDescription = sorteador.toString()
    }

    private fun ResetarNumeros(){
        val numero_inicial: EditText = findViewById(R.id.edit_digite_numero)
        numero_inicial.text.clear()
        val resultado : TextView = findViewById(R.id.text_resultado)
        resultado.text = "Nenhum número selecionado: "
    }

}