package model;

import java.util.ArrayList;
import java.util.Objects;
//crear metodos de asignar a un encargo un responsable, para poder asignarlo debe estar previamente como entegrante
abstract public class Tarea{

    //variables
    private String titulo, descripcion;
    private boolean prioritario,completada;
    private Persona[] encargados;
    private ArrayList<Encargo>listaTareas;

    //constructores
    public Tarea(){
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int numeroPersonas){
        //completada=false  no hace falta ponerlo ya que al ser un tipo primitivo se inicializa como lo mas basico posible
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.prioritario=prioritario;
        encargados=new Persona[numeroPersonas];
        listaTareas=new ArrayList<>();
    }

    public Tarea(String titulo, String descripcion, int numeroPersonas){
        //completada=false  no hace falta ponerlo ya que al ser un tipo primitivo se inicializa como lo mas basico posible
        this.titulo=titulo;
        this.descripcion=descripcion;
        encargados=new Persona[numeroPersonas];
        listaTareas=new ArrayList<>();
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

    private Encargo estaEncargo(int id){
        for (Encargo encargo :listaTareas){
            if (encargo.getId()==id){ return encargo;
            }
        }

        return null;
    }


    public void agregarEncargo(Encargo encargo){
        if (estaEncargo(encargo.getId())!=null){
            System.out.println("Error en el proceso");
        }else {
            listaTareas.add(encargo);
            System.out.println("Agregado correctamente");
        }
    }

    public void modificarEncargo(Encargo encargo) {
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getId() == encargo.getId()) {
                listaTareas.set(i, encargo);
                System.out.println("Encargo modificado correctamente");
                return;
            }
        }
        System.out.println("Encargo no encontrado, no se puede modificar");
    }

    public void borrarEncargo(int id){
        if (estaEncargo(id)!=null){
            listaTareas.remove(estaEncargo(id));
            System.out.println("borrado correctamente");
        }else {
            System.out.println("No esta en la lista");
        }
    }

    public void listraEncargos(){
        if(listaTareas.isEmpty()){
            System.out.println("No hay tareas");
        }else {
            for (Encargo encargo:listaTareas){
                encargo.mostrarDatos();            }
        }
    }

    public void buscarEncargoID(int id){
        for (Encargo encargo:listaTareas){
            if (encargo.getId()==id){
                encargo.mostrarDatos();
            }
        }
        System.out.println("encargo no encontrado");
    }

    public void listarEncargosCompletados(){
        for (Encargo encargo:listaTareas){
            if (encargo.isCompletada()){
                encargo.mostrarDatos();
            }
        }
    }

    public void listarIncompletas() {
        boolean hayIncompletas = false;
        for (Encargo encargo : listaTareas) {
            if (!encargo.isCompletada()) {
                System.out.println(encargo);
                hayIncompletas = true;
            }
        }
        if (!hayIncompletas) {
            System.out.println("No hay tareas incompletas");
        }
    }

    public void completarEncargo(int id){
        if (estaEncargo(id)!=null){
            estaEncargo(id).setCompletada(true);
        }else {
            System.out.println("El encargo no esta en la lista");
        }
    }

    public void completarTarea(){
        for (Encargo encargo:listaTareas){
            if (!encargo.isCompletada()){
                System.out.println("No se puede completar la tarea");
                return;
            }
        }
        completada=true;
        System.out.println("Tarea completada con exito");
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

    public Persona[] getEncargados() {
        return encargados;
    }

    public void setEncargados(Persona[] encargados) {
        this.encargados = encargados;
    }


    public abstract void enviarRecordatorio();

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