package main.kotlin

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val proceso = ProcessBuilder(
        // Ejecutable de Java
        "C:\\Users\\jorge\\.jdks\\openjdk-24.0.1\\bin\\java.exe",
        // Parámetros
        "-javaagent:C:\\Program Files (x86)\\cole\\IntelliJ IDEA Community Edition 2025.1.1.1\\lib\\idea_rt.jar=52130",
        "-Dfile.encoding=UTF-8",
        "-Dsun.stdout.encoding=UTF-8",
        "-Dsun.stderr.encoding=UTF-8",
        "-classpath",
        "C:\\Users\\jorge\\Documents\\GitHub\\Clase_DI\\TEMA1\\funcionesuntitled\\out\\production\\funciones;" +
                "C:\\Users\\jorge\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.1.20\\kotlin-stdlib-2.1.20.jar;" +
                "C:\\Users\\jorge\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
        "main.kotlin.HijoKt")
    val procesoEjecutado = proceso.start()

    val output = OutputStreamWriter(procesoEjecutado.outputStream)
    output.write("hola hijo\n")
    output.flush()
    val input = BufferedReader(InputStreamReader(procesoEjecutado.inputStream)).readLine()
    print(input)
}