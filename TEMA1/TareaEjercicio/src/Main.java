import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Tarea tarea = new Tarea("Practica DI", "Haremos TODO list", 6);
        tarea.asignarReasponsable(new Persona(12, "asjf12", "ana", "ahjja")); //al ser abstrata no se puede crear
        System.out.println("Primer programa de repaso");
        //variable -> guardar un valor que será utilizado
        final String DNI = "12345689A";     //variable constante
        String nombre = scanner.next();       //variable no constante
        int edad = scanner.nextInt();
        //Array -> Lista no dinamica
        //ArrayList o Hashtable -> Lista dinamica
        System.out.printf("mi nombre es %s y tengo %d años%n", nombre, edad);
        condicionales: if - if/else - if/else if/else
                         switch -> evalua el valor (int, char, string)

        repeticion: for -> recorrido coleccion
                      foreach -> recorres la coleccion completa
                      while -> va de 0 a N
                      do while -> va de 1 a N

        salto: break -> si se cumple la condicion mas cercana, se rompe
                 continue*/
        /*TareaProfesional tareaProfesional = new TareaProfesional("TareaP1", "descripcion", 5, 10000, new Date());
        tareaProfesional.asignarReasponsable(new Persona(12, "ldnf112", "Martin", "Borja"));
        tareaProfesional.asignarReasponsable(new Persona(13, "1232ASFA", "Martin", "Juan"));
        tareaProfesional.agregarEncargo(new Encargo(1, "ejemplo"));
        tareaProfesional.agregarEncargo(new Encargo(2, "ejemplo"));
        tareaProfesional.agregarEncargo(new Encargo(3, "ejemplo"));
        tareaProfesional.agregarEncargo(new Encargo(4, "ejemplo"));
        TareaPersonal tareaPersonal = new TareaPersonal("TareaPe2", "descripcion", 2,
                "Alcorcon");*/

        /*tareas.add(tareaPersonal);
        tareas.add(tareaProfesional);*/
        ArrayList<Tarea> tareas = new ArrayList<>();
        for (Tarea tarea1 : tareas) {
            tarea1.enviarRecordatorio();
        Scanner scanner = new Scanner(System.in);
        int opcion;
            do {
                System.out.println("1. Registrar una tarea");
                System.out.println("2. Modificar una tarea");
                System.out.println("3. Listar tareas");
                System.out.println("4. Completar una tarea");
                System.out.println("5. Listar completadas");
                System.out.println("6. Listar incompletadas");
                System.out.println("7. Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué tipo de tarea quieres registrar?");
                        System.out.println("1. Profesional");
                        System.out.println("2. Personal");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();

                        if (tipo == 1) {
                            System.out.print("Número de responsables: ");
                            int numResp = scanner.nextInt();
                            System.out.print("Presupuesto: ");
                            int presupuesto = scanner.nextInt();
                            TareaProfesional tp = new TareaProfesional(titulo, descripcion,numResp,presupuesto, new Date());
                            tareas.add(tp);
                            System.out.println("Tarea profesional registrada con éxito");
                        } else {
                            System.out.print("Número de responsables: ");
                            int numResp = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Lugar: ");
                            String lugar = scanner.nextLine();
                            TareaPersonal tper = new TareaPersonal(titulo, descripcion, numResp, lugar);
                            tareas.add(tper);
                            System.out.println("Tarea personal registrada con éxito");
                        }
                        break;
                    case 2:
                        System.out.print("ID del encargo a modificar: ");
                        int idEncargo = scanner.nextInt();
                        System.out.print("Nueva descripción: ");
                        String nuevaDescripcion = scanner.nextLine();
                        Encargo encargoModificado = new Encargo(idEncargo, nuevaDescripcion);
                        tarea1.modificarEncargo(encargoModificado);
                        break;
                    case 3:
                        tarea1.listraEncargos();
                        break;
                    case 4:
                        tarea1.completarTarea();
                        break;
                    case 5:
                        tarea1.listarEncargosCompletados();
                        break;
                    case 6:
                        tarea1.listarIncompletas();
                        break;
                    case 7:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("No existe");
                }
            } while (opcion < 8);
        }
    }
}
