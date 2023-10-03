package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica1.ui.theme.Practica1Theme
import kotlin.math.pow
fun main (){
val pi=3.1416f
val r=4f
val resultado=2*(pi)*r

    println("El perimetro del circulo es: $resultado")


}