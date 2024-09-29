import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
     
       int num1;
       double area;
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese el radio:" );
       num1 = scanner.nextInt();
       
       area=Math.PI* Math.pow(num1, 2);
 
       System.out.println("area del circulo es  " + area);
      
      
    }
}