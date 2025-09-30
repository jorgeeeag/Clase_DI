package Switch;

import java.util.Scanner;

public class EjercicioSwitch3 {
    public void Ejecutar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero1 = scanner.nextInt();
        System.out.println("Dame un numero");
        int numero2 = scanner.nextInt();
        System.out.println("Dime un operador: +, -, *, /");
        String operador=scanner.nextLine();
        switch (operador){
            case "+":
                System.out.println("Es " +(numero1+numero2));
                break;
            case "-":
                System.out.println("Es " +(numero1-numero2));
                break;
            case "*":
                System.out.println("Es " +(numero1*numero2));
                break;
            case "/":
                System.out.println("Es " +(numero1/numero2));
                break;
        }
    }
}
