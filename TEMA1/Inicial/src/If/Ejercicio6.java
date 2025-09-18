package If;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejecutar() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime dia");
        int dia= scanner.nextInt();
        System.out.println("Dime mes");
        int mes= scanner.nextInt();
        System.out.println("Dime años");
        int anos= scanner.nextInt();

        boolean mesEnRango=true;
        int diasDelMes;
        if (mes<1 || mes >12){
            mesEnRango=false;
        }else {
            switch (mes){
                case 1,3,5,7,8,10,12:
                    diasDelMes=31;
                    break;
                case 2:
                    diasDelMes=28;
                default:
                    diasDelMes=30;
            }
        }
        if (mesEnRango){
            System.out.println("Fecha correcta");
        }else {
            System.out.println("Fecha incorrecta");
        }
    }
}
