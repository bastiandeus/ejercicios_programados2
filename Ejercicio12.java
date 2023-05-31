import java.util.Scanner;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = input.nextInt();

            if (numero < 0) {
                countNegativos++;
            }
        }

        if (countNegativos > 0) {
            System.out.println("Se ha introducido al menos un numero negativo.");
        } else {
            System.out.println("No se ha introducido ningún numero negativo.");
        }
    }
}
