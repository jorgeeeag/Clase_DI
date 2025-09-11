import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Primer programa de repaso");
        //variable -> guardar un valor que será utilizado
        final String DNI = "12345689A";     //variable constante
        String nombre= scanner.next();       //variable no constante
        int edad= scanner.nextInt();
        //Array -> Lista no dinamica
        //ArrayList o Hashtable -> Lista dinamica
        System.out.printf("mi nombre es %s y tengo %d años%n",nombre,edad);
        /*condicionales: if - if/else - if/else if/else
                         switch -> evalua el valor (int, char, string)
         */
        /*repeticion: for -> recorrido coleccion
                      foreach -> recorres la coleccion completa
                      while -> va de 0 a N
                      do while -> va de 1 a N
         */
        /*salto: break -> si se cumple la condicion mas cercana, se rompe
                 continue
         /*Ejercicios IF
        1) Comparar dos enteros
        Lee dos enteros y muestra si el primero es mayor que el segundo.
        */
        System.out.println("Dime el numero 1");
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
