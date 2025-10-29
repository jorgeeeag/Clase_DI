package model;

public class VideojuegoRPG extends Videojuego implements Descargable{
    private boolean mundoAbierto;
    private int horasHistoriaPrincipal;
    private double tamanioGB;


    public VideojuegoRPG() {
    }

    public VideojuegoRPG(String titulo, String desarrollador, String clasificacionEdad, int anioLanzamiento, double precio, boolean mundoAbierto, int horasHistoriaPrincipal, double tamanioGB) {
        super(titulo, desarrollador, clasificacionEdad, anioLanzamiento, precio);
        this.mundoAbierto = mundoAbierto;
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
        this.tamanioGB= tamanioGB;
    }

    public void calcularPrecioFinal(boolean mundoAbierto, int horasHistoriaPrincipal){
        /*double precioFinal;
        if (mundoAbierto==true) {
            precioFinal = getPrecio() + (getPrecio() * 15) / 100;
        }else {
            System.out.println(precioFinal);
        }*/
    }

    public boolean isMundoAbierto() {
        return mundoAbierto;
    }

    public void setMundoAbierto(boolean mundoAbierto) {
        this.mundoAbierto = mundoAbierto;
    }

    public int getHorasHistoriaPrincipal() {
        return horasHistoriaPrincipal;
    }

    public void setHorasHistoriaPrincipal(int horasHistoriaPrincipal) {
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }

    public double getTamanioGB() {
        return tamanioGB;
    }

    public void setTamanioGB(double tamanioGB) {
        this.tamanioGB = tamanioGB;
    }

    @Override
    public String toString() {
        return super.toString()+ "VideojuegoRPG{" +
                "mundoAbierto=" + mundoAbierto +
                ", horasHistoriaPrincipal=" + horasHistoriaPrincipal +
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
