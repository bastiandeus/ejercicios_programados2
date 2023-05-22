import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = input.nextInt();
        if (num>=0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero negativo");
        }
    }
}
