package If;

import java.util.Scanner;

public class Ejercicio1 {
    public void ejecutar(){
        /*1) Comparar dos enteros
        Lee dos enteros y muestra si el primero es mayor que el segundo.*/
        Scanner scanner=new Scanner(System.in);
        int numero1=scanner.nextInt();
        System.out.println("Dime el numero 2");
        int numero2=scanner.nextInt();
        if (numero1>numero2){
            System.out.println("El numero 1 es mayor");
        }else {
            System.out.println("El numero 1 es mas pequeño");
        }
    }
}
