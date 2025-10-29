package model;

public class VideojuegoAccion extends Videojuego implements Descargable{
    private int nivelViolencia;
    private boolean modoMultijugador;
    private double tamanioGB;

    public VideojuegoAccion() {
    }

    @Override
    public Double calcularPrecioFinal() {
        return 0.0;
    }

    public VideojuegoAccion(String titulo, String desarrollador, String clasificacionEdad, int anioLanzamiento, double precio, int nivelViolencia, boolean modoMultijugador, double tamanioGB) {
        super(titulo, desarrollador, clasificacionEdad, anioLanzamiento, precio);
        this.nivelViolencia = nivelViolencia;
        this.modoMultijugador = modoMultijugador;
        this.tamanioGB=tamanioGB;
    }

    public void calcularPrecioFinal(int nivelViolencia,boolean modoMultijugador){
        double preciofinal;
        if (nivelViolencia>3 && modoMultijugador==true){
             preciofinal=getPrecio()+(getPrecio()*15)/100;
        } else if (modoMultijugador==true) {
             preciofinal=getPrecio()+(getPrecio()*10)/100;
        } else if (nivelViolencia>3){
             preciofinal=getPrecio()+(getPrecio()*5)/100;
        }else {
            preciofinal=getPrecio();
        }
        System.out.println(preciofinal);
    }



    public int getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(int nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    public boolean isModoMultijugador() {
        return modoMultijugador;
    }

    public void setModoMultijugador(boolean modoMultijugador) {
        this.modoMultijugador = modoMultijugador;
    }

    public double getTamanioGB() {
        return tamanioGB;
    }

    public void setTamanioGB(double tamanioGB) {
        this.tamanioGB = tamanioGB;
    }



    @Override
    public String toString() {
        return super.toString()+ "VideojuegoAccion{" +
                "nivelViolencia=" + nivelViolencia +
                ", modoMultijugador=" + modoMultijugador +
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
