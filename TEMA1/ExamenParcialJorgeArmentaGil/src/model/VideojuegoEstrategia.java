package model;

public class VideojuegoEstrategia extends Videojuego implements Descargable{
    private int complejidad, duracionPartida;
    private double tamanioGB;


    public VideojuegoEstrategia() {
    }

    public VideojuegoEstrategia(String titulo, String desarrollador, String clasificacionEdad, int anioLanzamiento, double precio, int complejidad, int duracionPartida, double tamanioGB) {
        super(titulo, desarrollador, clasificacionEdad, anioLanzamiento, precio);
        this.complejidad = complejidad;
        this.duracionPartida = duracionPartida;
        this.tamanioGB=tamanioGB;
    }

    public void calcularPrecioFinal(int complejidad){
        double precioFinal;
        if (complejidad==1){
            precioFinal=getPrecio()+(getPrecio()*3)/100;
        } else if (complejidad==2) {
            precioFinal=getPrecio()+(getPrecio()*6)/100;
        } else if (complejidad==3) {
            precioFinal=getPrecio()+(getPrecio()*9)/100;
        } else if (complejidad==4) {
            precioFinal=getPrecio()+(getPrecio()*12)/100;
        }else {
            precioFinal=getPrecio()+(getPrecio()*15)/100;
        }
        System.out.println(precioFinal);
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public int getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(int duracionPartida) {
        this.duracionPartida = duracionPartida;
    }

    public double getTamanioGB() {
        return tamanioGB;
    }

    public void setTamanioGB(double tamanioGB) {
        this.tamanioGB = tamanioGB;
    }

    @Override
    public String toString() {
        return super.toString()+"VideojuegoEstrategia{" +
                "complejidad=" + complejidad +
                ", duracionPartida=" + duracionPartida +
                ", tamanioGB=" + tamanioGB +
                '}';
    }

    @Override
    public void calcularTiempoDescarga(double velocidadInternet) {

    }

    @Override
    public void obtenerTamañoGB() {

    }
}
