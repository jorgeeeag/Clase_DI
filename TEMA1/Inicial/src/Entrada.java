import controller.Ejercicios;
import controller.EjerciciosSwicth;
import model.Tarea;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Tarea tarea=new Tarea("Practica DI","Haremos TODO list",6);
        tarea.asignarTarea();
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
                 continue*/

        Ejercicios ejercicios=new Ejercicios();
        EjerciciosSwicth ejerciciosSwitch=new EjerciciosSwicth();
        System.out.println("Elige el tipo de ejercicio:");
        System.out.println("1 - Ejercicio con if");
        System.out.println("2 - Ejercicio con switch");
        System.out.println("3 - Ejercicio con for");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido el ejercicio con if");
                System.out.println("Elige del 1 al 7");
                int ejercicio= scanner.nextInt();
                ejercicios.ejecutar(ejercicio);
            case 2:
                System.out.println("Has elegido el ejercicio con switch");
                System.out.println("Elige del 1 al 5");
                int ejercicioSwicth= scanner.nextInt();
                ejerciciosSwitch.ejecutar(ejercicioSwicth);
            case 3:
                System.out.println("Has elegido el ejercicio con for");

            default:
                System.out.println("Opción no válida");
        }
    }

}
