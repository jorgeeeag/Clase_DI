package For;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public void Ejecutar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce cuantas temperaturas quieres");
        int numero= scanner.nextInt();

        if (numero<=0){
            numero=10;
        }
        double suma=0;
        for (int i = 1; i <= numero; i++) {
            System.out.println("Temperatura "+i+" es: ");
            double temperatura= scanner.nextDouble();
            suma+=temperatura;
        }
        double media=suma/numero;
        System.out.println("La media es: "+media);
    }
}
