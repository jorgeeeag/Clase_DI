import controller.Ejercicios;
import controller.EjerciciosFor;
import controller.EjerciciosSwicth;


import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ejercicios ejercicios=new Ejercicios();
        EjerciciosSwicth ejerciciosSwitch=new EjerciciosSwicth();
        EjerciciosFor ejerciciosFor=new EjerciciosFor();
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
                System.out.println("Elige del 1 al 4");
                int ejecicioFor=scanner.nextInt();
                ejerciciosFor.ejecutar(ejecicioFor);

            default:
                System.out.println("Opción no válida");
        }
    }

}
