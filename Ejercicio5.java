import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
     
       int num1;
       double num2;
       String  texto;
       Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese el primer numero:" );
       num1 = scanner.nextInt();
       
       System.out.println("ingrese el segundo numero decimal:" );
       num2 = scanner.nextDouble();
        scanner.nextLine();
       System.out.println("ingrese el texto : " );
       texto= scanner.nextLine();
     
       System.out.println("el numero entero es " + num1);
       System.out.println("el numero decimal es " + num2);
       System.out.println("el texto es " + texto);
      
    }
}