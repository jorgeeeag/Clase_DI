import controller.Planificador;
import model.Prioridad;
import model.Tarea;
import model.TareaOcio;
import model.TareaTrabajo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planificador planificador=new Planificador();
        Scanner scanner = new Scanner(System.in);
        int contadorID=1;
        int opcion;
        do {
            System.out.println("1. Registrar una tarea");
            System.out.println("2. Modificar una tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Completar una tarea");
            System.out.println("5. Listar completadas");
            System.out.println("6. Listar incompletadas");
            System.out.println("7. Salir");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indique que tarea quiere: 1.Tarea de ocio o 2.Tarea de trabajo");
                    int respuesta= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Dime titulo");
                    String titulo= scanner.nextLine();
                    System.out.println("Dime descripcion");
                    String descripcion= scanner.nextLine();
                    System.out.println("Dime fecha");
                    String fecha= scanner.nextLine();
                    System.out.println("Prioridad: BAJA, MEDIA O ALTA");
                    Prioridad prioridad = Prioridad.valueOf(scanner.nextLine().toUpperCase());
                    if (respuesta==1){
                        System.out.println("Dime ubicacion");
                        String ubicacion= scanner.nextLine();
                        System.out.println("Dime presupuesto");
                        double presupuesto= scanner.nextDouble();
                        Tarea tarea=new TareaOcio(titulo,descripcion,fecha,contadorID++,false,prioridad,ubicacion,presupuesto);
                        planificador.registrarTarea(tarea);
                    }else{
                        System.out.println("Proyecto: ");
                        String proyecto= scanner.nextLine();
                        Tarea tarea = new TareaTrabajo(titulo,descripcion,fecha,contadorID++,false,prioridad,proyecto);
                        planificador.registrarTarea(tarea);
                    }
                    break;
                case 2:
                    System.out.println("ID de la tarea a modificar:");
                    int idModificado = scanner.nextInt();
                    scanner.nextLine();
                    Tarea tareaModificada = planificador.buscarPorId(idModificado);
                    if (tareaModificada != null) {
                        System.out.println("Nuevo título:");
                        tareaModificada.setTitulo(scanner.nextLine());
                        System.out.println("Nueva descripción:");
                        tareaModificada.setDescripcion(scanner.nextLine());
                        System.out.println("Nueva fecha:");
                        tareaModificada.setFecha(scanner.nextLine());
                        System.out.println("Nueva prioridad (BAJA, MEDIA, ALTA):");
                        tareaModificada.setPrioridad(Prioridad.valueOf(scanner.nextLine().toUpperCase()));
                        System.out.println("Tarea modificada correctamente.");
                    } else {
                        System.out.println("Tarea no encontrada.");
                    }
                    break;
                case 3:
                    planificador.listarTareas();
                    break;
                case 4:
                    System.out.println("ID de la tarea a completar:");
                    int idCompletar = scanner.nextInt();
                    scanner.nextLine();
                    Tarea tareaCompletada = planificador.buscarPorId(idCompletar);
                    if (tareaCompletada != null) {
                        tareaCompletada.setCompletada(true);
                        System.out.println("Tarea completada.");
                    } else {
                        System.out.println("Tarea no encontrada.");
                    }
                    break;
                case 5:
                    planificador.listarCompleatdas(true);
                    break;
                case 6:
                    planificador.listarIncompletadas(false);
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("No existe");
            }
        }while (opcion<8);
    }
}
