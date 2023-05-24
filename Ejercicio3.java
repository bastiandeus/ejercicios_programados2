import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();

        while (num1 == 0) {
            System.out.println("Error numero invalido. Ingrese otro numero");
            num1 = input.nextInt();
        }

        System.out.println("Ingrese otro numero");
        int num2 = input.nextInt();

        while (num2 == 0) {
            System.out.println("Error numero invalido. Ingrese otro numero");
            num2 = input.nextInt();
        }

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("El numero " + num1 + " es igual a " + num2);
        }
    }
}
