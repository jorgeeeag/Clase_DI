package model;

 public abstract class Videojuego implements Descargable{
    private String titulo,desarrollador,clasificacionEdad;
    private int anioLanzamiento;
    private double precio;

    public Videojuego() {
    }

    public Videojuego(String titulo, String desarrollador, String clasificacionEdad, int anioLanzamiento, double precio) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.clasificacionEdad = clasificacionEdad;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
    }

    abstract public Double calcularPrecioFinal(){

    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", clasificacionEdad='" + clasificacionEdad + '\'' +
                ", anioLanzamiento=" + anioLanzamiento +
                ", precio=" + precio +
                '}';
    }
}
