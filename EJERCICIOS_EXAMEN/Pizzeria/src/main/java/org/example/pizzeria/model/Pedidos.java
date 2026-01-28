package org.example.pizzeria.model;


public class Pedidos {
    private String nombre;
    private Pizzas pizza;
    private int telefono,id;

    static int contadorID=1;

    public Pedidos(String nombre, Pizzas pizza, int telefono) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.pizza = pizza;
        this.telefono = telefono;
    }

    public Pedidos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pizzas getPizza() {
        return pizza;
    }

    public void setPizza(Pizzas pizza) {
        this.pizza = pizza;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "con id: " + id + '\'' +
                ", nombre: '" + nombre + '\'' +
                "y pizza: " + pizza +
                '}';
    }
}
