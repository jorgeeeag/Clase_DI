package Switch;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjercicioSwitch2 {
    public void Ejecutar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un entero");
        int entero= scanner.nextInt();
        switch (entero%2){
            case 0:
                System.out.println("El numero es par");
                break;
            case 1:
                System.out.println("El numero es impar");
                break;
        }
    }

}
