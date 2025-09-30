package model;

public class TareaTrabajo extends Tarea{
    private String proyecto;

    public TareaTrabajo() {
    }

    public TareaTrabajo(String titulo, String descripcion, String fecha, int id, boolean completada, Prioridad prioridad, String proyecto) {
        super(titulo, descripcion, fecha, id, completada, prioridad);
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return super.toString()+ "TareaTrabajo{" +
                "proyecto='" + proyecto + '\'' +
                '}';
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
}
