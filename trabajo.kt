fun main() {
    println("Hola Mundo")
    val nombre = pedirNombre()
    println("Hola $nombre")
    val numeroEstudiantes = pedirCantidadEstudiantes()
    println("Hay $numeroEstudiantes estudiantes en el aula")
}

fun pedirCantidadEstudiantes(): Int {
    println("¿Cuántos estudiantes hay en el aula?")
    return readln().toInt()
}

fun pedirNombre(): String {
    println("¿Cuál es tu nombre?")
    return readln()
}
