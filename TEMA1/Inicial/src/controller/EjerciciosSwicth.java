package controller;

import If.*;
import Switch.*;

public class EjerciciosSwicth {
    public void ejecutar(int numero) {
        switch (numero) {
            case 1 -> new EjercicioSwitch1().Ejecutar();
            case 2 -> new EjercicioSwitch2().Ejecutar();
            case 3 -> new EjercicioSwitch3().Ejecutar();
            case 4 -> new EjercicioSwitch4().Ejecutar();
            case 5 -> new EjercicioSwitch5().Ejecutar();
            default -> System.out.println("Ejercicio no válido");
        }
    }
}
