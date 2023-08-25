package com.curso.android.app.practica.entregable


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val btn:Button= findViewById<Button>(R.id.button)

        btn.setOnClickListener {
//            Primer EditText
            val textUno = findViewById<EditText>(R.id.editTextText).text.toString()

//            Segundo EditText
            val textDos = findViewById<EditText>(R.id.editTextTwo).text.toString()

//            Llamada a TextView
            val espacioText = findViewById<TextView>(R.id.textView)

            val resultado = viewModel.comparacion(textUno, textDos)
            espacioText.text = resultado

        }


    }



}