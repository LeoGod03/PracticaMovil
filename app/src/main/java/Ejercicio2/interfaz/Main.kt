package Ejercicio2.interfaz

import Ejercicio2.logica.VolumenCilindro

fun main(){
    println("Ingrese la altura: ")
    val altura = readlnOrNull()?.toDoubleOrNull()?:1.0
    println("Ingresa el radio: ")
    val radio= readlnOrNull()?.toDoubleOrNull()?:1.0
}
