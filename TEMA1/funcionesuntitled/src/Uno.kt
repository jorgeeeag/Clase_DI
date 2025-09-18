package main.kotlin
import java.io.BufferedReader

import java.io.InputStreamReader

fun main(args: Array<String>) {
    /*val nombre = "arp -a"
    val proceso= ProcessBuilder("cmd.exe","/c","arp -a > fichero44.txt")
    proceso.redirectOutput(ProcessBuilder.Redirect.INHERIT)     //estoy uniendo mi proceso al proceso padre y redirigiendo a la consola y el proceso padre (processBuilder)
    proceso.redirectError(ProcessBuilder.Redirect.INHERIT)  //redirigir la salida del proceso
    print(procesotemporal.inputStream.bufferedReader().readText())*/

    //EJERCICIO PARA ABRIR EL NOTEPAD Y ESPERAR A QUE SE CIERRE
   /*val proceso = ProcessBuilder("notepad")
   val procesotemporal=proceso.start()
   print(procesotemporal.isAlive)
   procesotemporal.waitFor()*/

    //METER PROCESO TEMPORAL DENTRO DE UNA VARIABLE
    /*val nombre = "arp -a"
    val proceso= ProcessBuilder("cmd.exe","/c","arp -a")
    val procesotemporal=proceso.start()
    //procesotemporal.inputStream.bufferedReader().readText()
    val lector = BufferedReader(InputStreamReader(procesotemporal.inputStream))
    var linea: String?
    while (lector.readLine().also { linea=it}!=null){
    println(linea)
    }*/


    val process = ProcessBuilder("C:\\Users\\jorge\\.jdks\\openjdk-24.0.1\\bin\\java.exe",
        "-javaagent:C:\\Program Files (x86)\\cole\\IntelliJ IDEA Community Edition 2025.1.1.1\\lib\\idea_rt.jar=51493",
        "-Dfile.encoding=UTF-8",
        "-Dsun.stdout.encoding=UTF-8",
        "-Dsun.stderr.encoding=UTF-8",
        "-classpath",
        "C:\\Users\\jorge\\Documents\\GitHub\\Clase_PSP\\TEMA1\\funcion\\out\\production\\funcion;"
                +                "C:\\Users\\jorge\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.1.20\\kotlin-stdlib-2.1.20.jar;"
                +                "C:\\Users\\jorge\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
        "main.kotlin.HolaKt").start()
    val reader = BufferedReader(InputStreamReader(process.inputStream))
    val linea = reader.readLine()
    println(linea.uppercase())
}