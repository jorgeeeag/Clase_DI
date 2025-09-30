package For;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio2 {
    public void Ejecutar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero del 0 al 10");
        int numero = scanner.nextInt();
        if (numero>10){
            System.out.println("No");
        }else {
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero+" x "+i+" = "+(numero*i));
            }
        }
    }

}
