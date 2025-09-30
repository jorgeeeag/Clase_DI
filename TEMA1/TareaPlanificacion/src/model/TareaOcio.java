package model;

public class TareaOcio extends Tarea{
    private String ubicacion;
    private double presupuesto;

    public TareaOcio(String titulo, String descripcion, String fecha, int id, boolean completada, Prioridad prioridad, String ubicacion, double presupuesto) {
        super(titulo, descripcion, fecha, id, completada, prioridad);
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+ "TareaOcio{" +
                "ubicacion='" + ubicacion + '\'' +
                ", presupuesto=" + presupuesto +
                '}';
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
