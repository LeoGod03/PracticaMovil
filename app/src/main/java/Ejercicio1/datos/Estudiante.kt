package Ejercicio1.datos

interface Estudiante {

    fun calcularPromedioYNota()
    fun capturarDatos()
    fun getCalificacion() : Double
    fun getSumaCalificaciones(): Double
    fun getMatricula() : Int
    fun getNumeroDeCalificaciones() : Int
    fun getNombre(): String
    fun setCalificacion(calificacion : Double)
    fun setSumaCalificaciones(suma : Double)
    fun setMatricula(matricula : Int)
    fun setNumeroDeCalificaciones(numeroDeCalificaciones: Int)
    fun setNombre(nombre: String)

}