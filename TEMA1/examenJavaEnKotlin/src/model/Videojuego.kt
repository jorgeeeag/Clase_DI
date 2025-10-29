package model

open class Videojuego(private var titulo: String,
                      private var desarrollador: String,
                      private var anioLanzamiento: Int,
                      private var precio: Double,
                      private var clasificacionEdad: String) {
    fun calcularPrecioFinal(): Double {
        return precio
    }

    override fun toString(): String {
        return "Videojuego(titulo='$titulo', desarrollador='$desarrollador', anioLanzamiento=$anioLanzamiento, precio=$precio, clasificacionEdad='$clasificacionEdad')"
    }

}