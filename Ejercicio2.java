import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num1 = input.nextInt();
        System.out.println("Ingrese otro numero:");
        int num2 = input.nextInt();
        int result = num1%num2;
        if (result==0){
            System.out.println(num1+" es multiplo de "+num2);
        }else{
            System.out.println(num1+" NO es multiplo de "+num2);
            
        }
    }
}
