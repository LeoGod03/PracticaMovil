package Ejercicio2.logica

import Ejercicio2.datos.Pi
import Ejercicio2.datos.Dimensiones
import kotlin.math.pow

class VolumenCilindro: Pi, Dimensiones{
    //variables a ocupar
    private var altura: Double = 0.0
    private var radio: Double = 0.0
    private var numeroDeELemento: Int= 0

    //Pi
    override fun getNumeroDeElementos(): Int {
        return this.numeroDeELemento
    }
    override fun setNumeroDeElementos(numeroDeELemento: Int) {
        require(numeroDeELemento>0){"El numero de elemento debe ser mayor a cero"}
        this.numeroDeELemento = numeroDeELemento
    }
    override fun calcularPI(): Double {
        var puntosDentroCirculo = 0.0
        for (i in 0..getNumeroDeElementos()){
            val x = Math.random()
            val y = Math.random()
            if (x.pow(2.0) + y.pow(2.0) <= 1){
                puntosDentroCirculo++
            }
        }
        return 4 * puntosDentroCirculo / getNumeroDeElementos()
    }
    //Dimensiones
    override fun getAltura(): Double {
        return this.altura
    }
    override fun getRadio(): Double {
        return this.radio
    }
    override fun setAltura(altura: Double) {
        require(altura>0){"La altura debe ser mayor a cero"}
        this.altura = altura
    }
    override fun setRadio(radio: Double) {
        require(radio>0){"El radio debe ser mayo a cero"}
        this.radio = radio
    }

    private fun calcularVolumenCilindro(){
        val pi = calcularPI()
        println("El valor de PI es: $pi")
        val volumenCilindro = pi * radio.pow(2.0) * altura
        println("El volumen del cilindro es %.3f".format(volumenCilindro))
    }


    fun capturarDatos() {

        println("Ingrese el número de elementos para calular PI: ")
        setNumeroDeElementos(readlnOrNull()?.toIntOrNull()?:1)

        println("Ingresa el radio: ")
        setRadio(readlnOrNull()?.toDoubleOrNull()?:1.0)

        println("Ingrese la altura: ")
        setAltura(readlnOrNull()?.toDoubleOrNull()?:1.0)

        val volumen = calcularVolumenCilindro()

    }
}