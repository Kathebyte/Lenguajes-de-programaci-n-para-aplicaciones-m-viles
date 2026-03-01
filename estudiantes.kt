fun main() {
    // 1. Pedir el número de estudiantes
    val totalEstudiantes = pedirCantidad()

    // 2. Crear los "cajones" (Arrays) para guardar la información
    val nombres = Array(totalEstudiantes) { "" }
    val finales = Array(totalEstudiantes) { 0.0 }

    // 3. Llenar la información de cada estudiante
    for (i in 0 until totalEstudiantes) {
        println("\n--- Datos del Estudiante ${i + 1} ---")

        print("Escribe el nombre: ")
        nombres[i] = readln() // Lee el nombre como texto

        // Pedimos las 3 notas
        print("Nota 1: ")
        val n1 = readln().toDouble()

        print("Nota 2: ")
        val n2 = readln().toDouble()

        print("Nota 3: ")
        val n3 = readln().toDouble()

        // Calculamos el promedio usando una función y lo guardamos
        finales[i] = obtenerPromedio(n1, n2, n3)
    }

    // 4. Ordenar y mostrar los resultados
    ordenarYMostrar(nombres, finales)
}

// Función simple para pedir la cantidad de alumnos
fun pedirCantidad(): Int {
    print("¿Cuántos estudiantes hay en el aula?: ")
    return readln().toInt()
}

// Función que calcula la media de 3 notas
fun obtenerPromedio(nota1: Double, nota2: Double, nota3: Double): Double {
    return (nota1 + nota2 + nota3) / 3
}

// Función que ordena de mayor a menor y muestra la lista
fun ordenarYMostrar(nombres: Array<String>, notas: Array<Double>) {
    val total = nombres.size

    // Usamos el método de la burbuja (el más sencillo) para ordenar
    for (paso in 0 until total - 1) {
        for (i in 0 until total - 1 - paso) {
            // Si la nota de la izquierda es menor que la de la derecha...
            if (notas[i] < notas[i + 1]) {

                // Intercambiamos las notas de posición
                val temporalNota = notas[i]
                notas[i] = notas[i + 1]
                notas[i + 1] = temporalNota

                // ¡Muy importante! También intercambiamos los nombres para que sigan a su nota
                val temporalNombre = nombres[i]
                nombres[i] = nombres[i + 1]
                nombres[i + 1] = temporalNombre
            }
        }
    }

    // Al final, imprimimos la lista ya ordenada
    println("\n===== LISTA DE ESTUDIANTES (MAYOR A MENOR) =====")
    for (i in 0 until total) {
        println("${i + 1}. ${nombres[i]} - Nota Final: ${notas[i]}")
    }
}
