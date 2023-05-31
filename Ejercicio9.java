import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese numeros:");

        do {
            numero = input.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}