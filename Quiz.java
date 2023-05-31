/*1-Solicitar al usuario filas y columnas 
las cuales deberá recorrer para rellenar con su nombre. */
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas ");
        int filas = input.nextInt();
        while (filas<=0){
            System.out.println("Fuera del rango valido. Ingrese nuevamente");
            filas=input.nextInt();
        }
        System.out.println("Ingrese la cantidad de columnas ");
        int columnas = input.nextInt();
        while (columnas<=0){
            System.out.println("Fuera del rango valido. Ingrese nuevamente");
            columnas=input.nextInt();
        }
        System.out.println("Ingrese su nombre ");
        String name = input.next();

        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print(name+" || ");
            }
            System.out.println("");
        }

    }
}