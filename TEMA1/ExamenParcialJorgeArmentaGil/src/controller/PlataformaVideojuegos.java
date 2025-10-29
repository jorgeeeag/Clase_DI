package controller;

import model.Videojuego;

import java.util.ArrayList;
import java.util.Objects;

public class PlataformaVideojuegos {
    ArrayList<Videojuego>listaVideojuegos;

    public PlataformaVideojuegos(){
        listaVideojuegos=new ArrayList<>();
    }

    public void anadirVideojuegos(Videojuego videojuego){
        listaVideojuegos.add(videojuego);
    }
    public void borrarVideojuegos(){
        for (Videojuego videojuego:listaVideojuegos){
            listaVideojuegos.remove(videojuego);
        }
    }
    public void mostrarVideojuegos(){
        for (Videojuego videojuego:listaVideojuegos){
            System.out.println(videojuego.toString());
        }
    }

    /*public void mostrarVideojuegosPrecio(){
        for (int i = 0; i < listaVideojuegos.size(); i++) {
            listaVideojuegos
        }
    }*/
    public void filtrarClasificacionEdad(){
        for (Videojuego videojuego:listaVideojuegos){
            if (Objects.equals(videojuego.getClasificacionEdad(), "PEGI 3")){
                System.out.println(videojuego.getTitulo());
            } else if (Objects.equals(videojuego.getClasificacionEdad(), "PEGI 7")) {
                System.out.println(videojuego.getTitulo());
            } else if (Objects.equals(videojuego.getClasificacionEdad(), "PEGI 12")) {
                System.out.println(videojuego.getTitulo());
            } else if (Objects.equals(videojuego.getClasificacionEdad(), "PEGI 16")) {
                System.out.println(videojuego.getTitulo());
            } else{
                System.out.println(videojuego.getTitulo());
            }
        }
    }
    public void calcularPrecioTotal(){
        double precioTotal=0;
        for (Videojuego videojuego:listaVideojuegos){
            precioTotal+=videojuego.getPrecio();
        }
        System.out.println(precioTotal);
    }
}

