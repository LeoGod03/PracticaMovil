package Ejercicio1.logica

import Ejercicio1.datos.Estudiante

class EvaluandoEstudiante: Estudiante {
    private var matricula: Int = 0
    private var nombre: String = ""
    private var numeroDeCalificaciones: Int = 0
    private var calificacion: Double = 0.0
    private var sumaDeCalificaciones: Double = 0.0
    private var calificaciones: MutableList<Double> = mutableListOf()
    private var nota : String = ""
    override fun calcularPromedioYNota() {
        capturarDatos()
        var suma = 0.0
        for(i in calificaciones){
            suma += i
        }
        setSumaCalificaciones(suma)
        setCalificacion(suma / getNumeroDeCalificaciones())
        nota = when(getCalificacion()){
            in 0.0..5.9 -> "NP"
            in 6.0..7.4 -> "S"
            in 7.5 .. 8.9 -> "B"
            in 9.0..10.0 -> "MB"
            else -> "sin rango para la calificación"
        }
        imprimirDatos()
    }

    override fun capturarDatos() {
        println("Introduzca nombre del estudiante:")
        setNombre(readlnOrNull()?.takeIf { it.isNotBlank()} ?: "Sin nombre")
        println("Introduzca matrícula:")
        setMatricula(readlnOrNull()?.toIntOrNull() ?: 0)
        println("Introduzca el número de calificaciones del estudiante")
        setNumeroDeCalificaciones(readlnOrNull()?.toIntOrNull() ?: 0)
        var cal = 0.0
        for(i in 1..getNumeroDeCalificaciones()){

            println("Introduzca calificacion No. $i:")
            cal = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            require(cal in 0.0.. 10.0) {"La calificación debe estar entre el rango de 0 y 10"}
            calificaciones.add(cal)
        }

    }

    override fun getCalificacion(): Double {
        return calificacion
    }

    override fun getSumaCalificaciones(): Double {
        return sumaDeCalificaciones
    }

    override fun getMatricula(): Int {
        return matricula
    }

    override fun getNumeroDeCalificaciones(): Int {
        return numeroDeCalificaciones
    }

    override fun getNombre(): String {
        return nombre
    }

    override fun setCalificacion(calificacion: Double) {
        require(calificacion >= 0) {"La calificación debe ser mayor o igual a cero"}
        this.calificacion = calificacion
    }

    override fun setSumaCalificaciones(suma: Double) {
        require(sumaDeCalificaciones >= 0) {"La suma de calificaciones debe ser mayor o igual a 0"}
        this.sumaDeCalificaciones = suma
    }

    override fun setMatricula(matricula: Int) {
        require(matricula > 0) {"La matrícula debe ser mayor a 0"}
        this.matricula = matricula
    }

    override fun setNumeroDeCalificaciones(numeroDeCalificaciones: Int) {
        require(numeroDeCalificaciones > 0) {"El número de calificaciones debe ser mayor a 0"}
        this.numeroDeCalificaciones = numeroDeCalificaciones
    }

    override fun setNombre(nombre: String) {
        require(nombre.isNotBlank()) {"El nombre no puede ir vacío"}
        this.nombre = nombre
    }


    private fun imprimirDatos(){
        println("El nombre del estudiante es: ${getNombre()} con matrícula : ${getMatricula()}")
        println("Número de calificaciones: ${getNumeroDeCalificaciones()}")
        println("Suma de calificaciones: ${getSumaCalificaciones()}")
        println(String.format("Calificación %.2f", getCalificacion()))
        println("Nota: $nota")
    }

}