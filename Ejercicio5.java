import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entre 0 y 9999: ");
        int num = input.nextInt();
        while (num < 0 || num > 9999) {
            System.out.println("El numero ingresado esta fuera del rango valido.");
            num = input.nextInt();
        }
       
        int cifras = contarCifras(num);
        System.out.println("El numero " + num + " tiene " + cifras + " cifras");
        
        
        input.close();
    }
    
    public static int contarCifras(int numero) {
        if (numero == 0) {
            return 1;
        }
        
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        
        return contador;
    }
}

