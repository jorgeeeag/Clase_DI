import controller.PlataformaVideojuegos;
import model.Videojuego;
import model.VideojuegoAccion;
import model.VideojuegoEstrategia;
import model.VideojuegoRPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlataformaVideojuegos plataformaVideojuegos=new PlataformaVideojuegos();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        VideojuegoAccion videojuegoAccion1=new VideojuegoAccion("juegoAccion1","hola","PEGI 3",2020,50.99,1,true,50);
        videojuegoAccion1.calcularPrecioFinal(4,true);
        VideojuegoAccion videojuegoAccion2=new VideojuegoAccion("juegoAccion2","adios","PEGI 18",2015,22.99,4,false,40);
        videojuegoAccion2.calcularPrecioFinal(1,false);
        VideojuegoEstrategia videojuegoEstrategia1=new VideojuegoEstrategia("juegoEstrategia2","que","PEGI 7",2021,19.99,1,4,60);
        videojuegoEstrategia1.calcularPrecioFinal(5);
        VideojuegoEstrategia videojuegoEstrategia2=new VideojuegoEstrategia("juegoEstrategia2","tal","PEGI 16",2025,70.99,5,1,20);
        videojuegoEstrategia2.calcularPrecioFinal(5);
        VideojuegoRPG videojuegoRPG1= new VideojuegoRPG("juegoRPG1","bien","PEGI 12",1999,20.89,true,20,10);
        videojuegoRPG1.getClasificacionEdad();
        VideojuegoRPG videojuegoRPG2= new VideojuegoRPG("juegoRPG2","mal","PEGI 13",2024,50.09,false,10,50);
        videojuegoRPG2.getClasificacionEdad();
        do {
            System.out.println("MENU INTERACTIVO");
            System.out.println("1.Ver todos los juegos disponibles");
            System.out.println("2.Filtrar por tipo");
            System.out.println("3.Filtrar por edad");
            System.out.println("4.Ver detalles de un juego");
            System.out.println("5.Calcular el tiempo de descarga de un juego");
            System.out.println("6.Calcular el precio total");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    plataformaVideojuegos.mostrarVideojuegos();
                    break;
                case 2:
                    /*plataformaVideojuegos.*/
                    break;
                case 3:
                    plataformaVideojuegos.filtrarClasificacionEdad();
                    break;
                case 4:
                    /*plataformaVideojuegos.*/
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("dime tiempo de descarga");
                    double tiempoDescarga= scanner.nextDouble();
                    videojuegoRPG1.calcularTiempoDescarga(tiempoDescarga);
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
            }

        }while (opcion <= 7) ;
    }
}
