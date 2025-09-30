package model;

import java.util.ArrayList;

public abstract class Lista implements Planificable {
    private int id;
    private ArrayList<String> elementos;

    public Lista(int id) {
        this.id = id;
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(String e) {
        elementos.add(e);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "id=" + id +
                ", elementos=" + elementos +
                '}';
    }
}
