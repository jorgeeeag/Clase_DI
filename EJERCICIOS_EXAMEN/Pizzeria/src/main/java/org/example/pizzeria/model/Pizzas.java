package org.example.pizzeria.model;

public class Pizzas {
    private String nombre,tamanio;
    private double precio;



    public Pizzas(String nombre, String tamanio, double precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public Pizzas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                '}';
    }
}
