package Switch;

import java.util.Scanner;

public class EjercicioSwitch4 {
    public void Ejecutar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        switch (numero){
            case 1,2,12:
                System.out.println("Invierno");
                break;
            case 3,4,5:
                System.out.println("Primavera");
                break;
            case 6,7,8,9:
                System.out.println("Verano");
                break;
            case 10,11:
                System.out.println("Otoño");
                break;
        }
    }
}
