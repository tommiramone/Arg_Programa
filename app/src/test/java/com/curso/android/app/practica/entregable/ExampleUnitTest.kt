package com.curso.android.app.practica.entregable

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

//    Esto comprueba que el viewModel se crea correctamente
    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun testIguales() {
        val resultado = viewModel.comparacion("hola", "hola")
        assertEquals("Son iguales", resultado)
    }

    @Test
    fun testDiferentes() {
        val resultado = viewModel.comparacion("hola", "mundo")
        assertEquals("Son diferentes", resultado)
    }
}