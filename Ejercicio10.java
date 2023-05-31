import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System. in);
        int num;
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            sum+=num;
        }
    System.out.println("La suma de los 15 numeros es: " + sum); 
    }
}
