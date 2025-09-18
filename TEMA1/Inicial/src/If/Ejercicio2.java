package If;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar() {
        /*1) Comparar dos enteros
        Lee dos enteros y muestra si el primero es mayor que el segundo.*/
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        boolean multiplo20 = numero1 % 20 == 0;
        boolean estaEntre = numero1 <= -100 && numero1 >= 100;
        if (multiplo20 && estaEntre) {
            System.out.println("Es mutiplo de 20 y está entre -100 y 100");
        } else if (multiplo20) {
            System.out.println("Es multiplo de 20 pero no está entre el rango");
        } else if (estaEntre) {
            System.out.println("Está entre el rango pero no es multiplo de 20");
        } else {
            System.out.println("No es ni multiplo ni esta entre el rango");
        }
    }
}
