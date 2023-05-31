import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingreseunnumero:");
        int num = input.nextInt();
        while (num > 0) {
            System.out.println("El cuadrado de " + num + " es " + (num * num));
            System. out.println("Ingrese un numero:");
            num = input.nextInt();
        }
    }
}
