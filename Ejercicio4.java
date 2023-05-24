import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leedor = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = leedor.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = leedor.nextInt();

        System.out.println("Ingrese el tercer numero");
        int num3 = leedor.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("El numero mayor es: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("El numero mayor es: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("El numero mayor es: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("El numero mayor es: " + num2 + " " + num3 + " " + num1);
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println("El numero mayor es: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("El numero mayor es: " + num3 + " " + num2 + " " + num1);
            }
        }
    }
}
