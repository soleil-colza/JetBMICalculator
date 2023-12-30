package com.example.jetbmicalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.pow
import kotlin.math.roundToInt

class MainViewModel : ViewModel() {
    var height by mutableStateOf("")
    var weight by mutableStateOf("")
    var bmi by mutableStateOf(0f) //0fはFloat型の初期値

    fun calculateBMI(){
        val heightNumber = height.toFloatOrNull() ?.div(100) ?: 0f
        val weightNumber = weight.toFloatOrNull() ?: 0f
    }
}