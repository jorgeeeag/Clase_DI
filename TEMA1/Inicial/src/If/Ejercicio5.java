package If;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejecutar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numero= scanner.nextInt();
        int resultado=numero;
        if (numero%2==0){
            resultado+=2;
        }
        if (numero%3==0) {
            resultado+=3;
        }
        if (numero%5==0) {
            resultado+=5;
        }
        if (numero == resultado){
            resultado+=1;
        }
        System.out.println(resultado);
        }
    }
