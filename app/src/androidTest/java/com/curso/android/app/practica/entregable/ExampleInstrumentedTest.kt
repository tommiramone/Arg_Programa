package com.curso.android.app.practica.entregable

import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testIguales() {
        Espresso.onView (
            ViewMatchers.withId(R.id.editTextText)
        ).perform(ViewActions.typeText("Hola"))

        Espresso.onView (
            ViewMatchers.withId(R.id.editTextTwo)
        ).perform(ViewActions.typeText("Hola"))

        Espresso.onView (
            ViewMatchers.withId(R.id.button)
        ).perform(ViewActions.click())

        Espresso.onView (
            ViewMatchers.withId(R.id.textView)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("Son iguales")
            )
        )
    }

    @Test
    fun testDiferentes() {
        Espresso.onView (
            ViewMatchers.withId(R.id.editTextText)
        ).perform(ViewActions.typeText("Hola"))

        Espresso.onView (
            ViewMatchers.withId(R.id.editTextTwo)
        ).perform(ViewActions.typeText("Chau"))

        Espresso.onView (
            ViewMatchers.withId(R.id.button)
        ).perform(ViewActions.click())

        Espresso.onView (
            ViewMatchers.withId(R.id.textView)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("Son diferentes")
            )
        )
    }
}