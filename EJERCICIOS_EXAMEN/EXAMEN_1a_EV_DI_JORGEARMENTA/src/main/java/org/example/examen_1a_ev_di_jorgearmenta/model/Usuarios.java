package org.example.examen_1a_ev_di_jorgearmenta.model;

public class Usuarios {
    private String nombre,correo,pass;
    private int id;
    int contadorID=1;
    public Usuarios() {
    }

    public Usuarios(String nombre, String correo, String pass) {
        this.id=contadorID++;
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", pass='" + pass + '\'' +
                ", correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
