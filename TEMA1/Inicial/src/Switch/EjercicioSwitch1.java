package Switch;

import java.util.Scanner;

public class EjercicioSwitch1 {
    public void Ejecutar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un caracter");
        char letra=scanner.next().charAt(0);
        switch (letra){
            case 'a', 'e', 'i', 'o','u':
                System.out.println("vocal");
                break;
            default:
                System.out.println("consonante");
        }
    }
}
