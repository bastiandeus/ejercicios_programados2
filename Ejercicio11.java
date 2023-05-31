import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de sueldos: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El número de sueldos debe ser mayor que cero.");
            return;
        }

        double maxSueldo = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo > maxSueldo) {
                maxSueldo = sueldo;
            }
        }

        System.out.println("El sueldo máximo es: " + maxSueldo);
    }
}
