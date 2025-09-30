package controller;


import For.Ejercicio1;
import For.Ejercicio2;
import For.Ejercicio3;
import For.Ejercicio4;

public class EjerciciosFor {
    public void ejecutar(int numero) {
        switch (numero) {
            case 1 -> new Ejercicio1().Ejecutar();
            case 2 -> new Ejercicio2().Ejecutar();
            //case 3 -> new Ejercicio3().Ejecutar();
            //case 4 -> new Ejercicio4().Ejecutar();
            default -> System.out.println("Ejercicio no válido");
        }
    }
}
