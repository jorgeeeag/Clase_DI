package org.example.examen_1a_ev_di_jorgearmenta.model;

public class Productos {
    private String  nombre, categoria;
    private double precio;
    private int id;
    int contadorID=1;
    public Productos() {
    }

    public Productos(String nombre, String categoria, double precio) {
        this.id=contadorID++;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
