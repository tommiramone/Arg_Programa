package com.curso.android.app.practica.entregable

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun comparacion(textUno: String, textDos: String): String {
        return if (textUno == textDos) {
            "Son iguales"
        } else {
            "Son diferentes"
        }
    }
}
