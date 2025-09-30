package model;

import java.util.Date;

public class TareaProfesional extends Tarea{
    private int presupuesto;
    private Date fechaLimite;

    public TareaProfesional(){

    }

    @Override
    public void enviarRecordatorio() {
        //se imprime por consola a cada uno de los responsables el mensaje
        for (Persona persona:getEncargados()){
            if (persona!=null){
                System.out.printf("%s recuerda que completar %d");
            }
        }
    }

    public TareaProfesional(String titulo, String descripcion, int numeroPersonas,
                             int presupuesto,Date fechaLimite){
        super(titulo,descripcion,numeroPersonas);
        this.fechaLimite=fechaLimite;
        this.presupuesto=presupuesto;

     }
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override           //si no ponemos esto solo se va a quedar lo anterior del metodo toString de tarea
    public String toString() {
        return super.toString()+ "TareaProfesional{" +
                "presupuesto=" + presupuesto +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
