package Ejercicio2.logica

import Ejercicio2.datos.Pi
import Ejercicio2.datos.Dimensiones
class VolumenCilindro: Pi, Dimensiones{
    //variables a ocupar
    private var altura: Double = 0.0
    private var radio: Double = 0.0
    private var numeroDeELemento: Int= 0

    //Pi
    override fun getNumeroDeElementos(): Int {return this.numeroDeELemento}
    override fun setNumeroDeElementos(numeroDeELemento: Int) {require(numeroDeELemento>0){"El numero de elemento debe ser mayor a cero"}}
    override fun calcularPI(): Double {return Math.PI}
    //Dimensiones
    override fun getAltura(): Double {return this.altura}
    override fun getRadio(): Double {return this.radio}
    override fun setAltura(altura: Double) {require(altura>0){"La altura debe ser mayor a cero"}}
    override fun setRadio(radio: Double) {require(radio>0){"El radio debe ser mayo a cero"}}

    fun calcularVolumenCilindro(){
        val pi = calcularPI()
        val volumenCilindro = pi * Math.pow(radio,2.0) * altura
        println("El volumen del cilindro es: $volumenCilindro")
    }
}