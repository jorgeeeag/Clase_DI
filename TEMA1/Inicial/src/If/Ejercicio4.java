package If;

import java.util.Scanner;

public class Ejercicio4 {
        public void ejecutar() {
        /*4) Comparar dos enteros
        Lee dos enteros y muestra si el primero es mayor que el segundo.*/
            Scanner scanner = new Scanner(System.in);
            int numero1 = scanner.nextInt();
            if (numero1%2==0){
                numero1++;
                System.out.println(numero1);
            }else {
                numero1--;
                System.out.println(numero1);
            }
        }
    }
