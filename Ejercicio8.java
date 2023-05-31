import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
 
        int numero=1;
        while(numero!=0){
            System.out.println("Ingrese un numero");
            numero=input.nextInt();
            if(numero>0){
             System.out.println("El numero:"  +numero+ " es positivo");
            }else if(numero<0){
             System.out.println("El numero:" +numero+ " es negativo");
            }else{
                System.out.println("Programa cerrado");
            }
        }
    }
}