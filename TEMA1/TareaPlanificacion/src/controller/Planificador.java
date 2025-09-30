package controller;

import model.Planificable;
import model.Tarea;

import java.util.ArrayList;

public class Planificador {
    ArrayList<Tarea> listaTareas;
    ArrayList<Planificable>elementos;

    public Planificador() {
        listaTareas = new ArrayList<>();
        elementos=new ArrayList<>();
    }

    public void registrarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public Tarea buscarPorId(int id) {
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id)
                return tarea;
        }
        return null;
    }

    public void listarTareas() {
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea);
        }
    }

    public void listarCompleatdas(boolean completadas) {
        for (Tarea tarea : listaTareas) {
            if (tarea.isCompletada() == completadas) {
                System.out.println(tarea);
            }
        }
    }

    public void listarIncompletadas(boolean completadas) {
        for (Tarea tarea : listaTareas) {
            if (tarea.isCompletada() != completadas) {
                System.out.println(tarea);
            }
        }
    }
    public void registrarElemento(Planificable p) {
        elementos.add(p);
    }

    public void listarElementos() {
        for (Planificable p : elementos) {
            System.out.println(p);
        }
    }
    public void agregarPersonaATarea(int id, String persona) {
        for (Planificable p : elementos) {
            if (p instanceof Tarea && p.getId() == id) {
                ((Tarea) p).agregarPersona(persona);
            }
        }
    }

    public void agregarEncargoATarea(int id, String encargo) {
        for (Planificable p : elementos) {
            if (p instanceof Tarea && p.getId() == id) {
                ((Tarea) p).agregarEncargo(encargo);
            }
        }
    }
}