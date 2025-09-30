package controller;

import If.*;

public class Ejercicios {
    public void ejecutar(int numero) {
        switch (numero) {
            case 1 -> new Ejercicio1().ejecutar();
            case 2 -> new Ejercicio2().ejecutar();
            //case 3 -> new Ejercicio3().ejecutar();
            case 4 -> new Ejercicio4().ejecutar();
            case 5 -> new Ejercicio5().ejecutar();
            case 6 -> new Ejercicio6().ejecutar();
            //case 7 -> new Ejercicio7().ejecutar();
            default -> System.out.println("Ejercicio no válido");
        }
    }
}
