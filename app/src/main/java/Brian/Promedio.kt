package Brian

fun promedio(numero: IntArray): Double{
    var suma = 0
    for (num in numero){
        suma += num
    }
    return suma.toDouble() / numero.size
}