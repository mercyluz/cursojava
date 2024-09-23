import java.util.Scanner;
public class ejercicio6 {

    public static void main(String[] args) {
     
       int num1, num2, sum;
       Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese el primer numero:" );
       num1 = scanner.nextInt();
       
       System.out.println("ingrese el segundo numero" );
       num2 = scanner.nextInt();
       
      sum = num1 + num2;
      System.out.println("la suma de los dos nuemros es:" + sum);

      
    }
}