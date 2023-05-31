import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dia:");
        int dia = input.nextInt();
        while (dia<1||dia>30){
            System.out.println("Fuera del rango valido. Ingrese nuevamente");
            dia=input.nextInt();
        }
        System.out.println("Ingrese el mes:");
        int mes = input.nextInt();
        while (mes<0||mes>12){
            System.out.println("Fuera del rango valido. Ingrese nuevamente");
            mes=input.nextInt();
        }
        System.out.println("Ingrese el anio:");
        int anio = input.nextInt();
        while (anio<0||anio>2023){
            System.out.println("Fuera del rango valido. Ingrese nuevamente");
            anio=input.nextInt();
        }
        System.out.println("***FECHA DIGITADA CORRECTAMENTE***");
    }
}
