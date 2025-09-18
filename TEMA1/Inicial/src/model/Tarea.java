package model;

import java.util.Objects;

public class Tarea{

    //variables
    private String titulo, descripcion;
    private boolean prioritario,completada;
    private Persona[] encargados;

    //constructores
    public Tarea(){
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int numeroPersonas){
        //completada=false  no hace falta ponerlo ya que al ser un tipo primitivo se inicializa como lo mas basico posible
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.prioritario=prioritario;
        encargados=new Persona[numeroPersonas];
    }

    public Tarea(String titulo, String descripcion, int numeroPersonas){
        //completada=false  no hace falta ponerlo ya que al ser un tipo primitivo se inicializa como lo mas basico posible
        this.titulo=titulo;
        this.descripcion=descripcion;
        encargados=new Persona[numeroPersonas];
    }

    //metodos -> getter, setter, toString
    public void asignarReasponsable(Persona persona){
        for (int i = 0; i < encargados.length; i++) {
            if (encargados[i]==null && !estaDNI(persona.getDni())){
                encargados[i]=persona;
            }
        }
        System.out.println("Persona no agregada");
    }

    private boolean estaDNI(String dni){
        for (Persona persona:encargados){
            if (persona!=null && persona.getDni().equalsIgnoreCase(dni)){
                return true;
            }
        }
        return false;
    }

    private void quitarResponsables(String dni){
        for (Persona persona:encargados){
            if (persona != null && persona.getDni().equalsIgnoreCase(dni)){
                persona=null;
                System.out.println("Persona eliminada");
                return;
            }
        }
        System.out.printf("La persona con dni %s no esta en esta tarea",dni);
    }

    public void mostrarDatos(){
        int numeroHuecos=0;
        for (Persona persona:encargados){
            if (persona==null){
                numeroHuecos++;
            }else {
                System.out.printf("Los datos de los participantes son: %s, %s, %s, %d",
                        persona.getNombre(),persona.getApellido(),persona.getDni(),persona.getEdad());
            }
        }
        if (numeroHuecos==encargados.length){
            System.out.println("No hay responsables");
        } else if (numeroHuecos>0) {
            System.out.printf("Hay %d huecos disponibles",numeroHuecos);
        }else {
            System.out.println("Todos los responsables estan asignados");
        }
    }

    public void crearEncargo(){

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

    public boolean isPrioritario() {
        return prioritario;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioritario=" + prioritario +
                ", completada=" + completada +
                '}';
    }
}
