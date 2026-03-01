fun main() {
    println("Lenguajes de programación para aplicaciones móviles")
    val nombre = nombreEstudiante()
    println("Hola $nombre")

    // pedir numero de estudiantes
    val numeroEstudiantes = totalCantidadEstudiantes()
    println("Hay $numeroEstudiantes estudiantes en el aula")

    val nombres = Array(numeroEstudiantes) { "" }
    val finales = Array(numeroEstudiantes) { 0.0 }

    for (i in 0 until numeroEstudiantes) {
        println("\n Informacion del Estudiante ${i + 1} ")

        print("Nombre Completo: ")
        nombres[i] = readln() // Lee el nombre como texto

        // Pedimos las 3 notas
        print("Nota 1: ")
        val n1 = readln().toDouble()

        print("Nota 2: ")
        val n2 = readln().toDouble()

        print("Nota 3: ")
        val n3 = readln().toDouble()

        var finalNota = calcularPromedio(n1, n2, n3)
        finales[i] = finalNota
    }
}

fun totalCantidadEstudiantes(): Int {
    println("¿Cuántos estudiantes hay en el aula?")
    return readln().toInt()
}

fun nombreEstudiante(): String {
    println("¿Cuál es tu nombre?")
    return readln()
}

fun calcularPromedio(n1: Double, n2: Double, n3: Double): Double {
    return (n1 + n2 + n3) / 3
}
