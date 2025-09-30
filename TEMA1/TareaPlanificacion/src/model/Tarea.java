package model;

import java.util.ArrayList;

public abstract class Tarea implements Planificable{
    private String titulo, descripcion, fecha;
    private int id;
    private boolean completada;
    private Prioridad prioridad;
    ArrayList<Tarea>listaSubtareas=new ArrayList<>();
    private ArrayList<String> personas = new ArrayList<>();
    private ArrayList<String> encargos = new ArrayList<>();

    public Tarea(){}

    public Tarea(String titulo, String descripcion, String fecha, int id, boolean completada, Prioridad prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.id = id;
        this.completada = completada;
        this.prioridad=prioridad;
    }

    //metodos
    public void anadirSubtarea(Tarea tarea){
        listaSubtareas.add(tarea);
    }

    public void agregarPersona(String persona) {
        personas.add(persona);
    }

    public void agregarEncargo(String encargo) {
        encargos.add(encargo);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", id=" + id +
                ", completada=" + completada +
                ", prioridad=" + prioridad +
                ", listaSubtareas=" + listaSubtareas +
                '}';
    }



    @Override
    public int getid() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompletada() {
        return completada;
    }

    public ArrayList<Tarea> getListaSubtareas() {
        return listaSubtareas;
    }

    public void setListaSubtareas(ArrayList<Tarea> listaSubtareas) {
        this.listaSubtareas = listaSubtareas;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}


