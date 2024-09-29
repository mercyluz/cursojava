import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        
   int num1;

   Scanner scanner = new Scanner(System.in);
  
 System.out.println("Ingresa el numero  " );
  num1 = scanner.nextInt();
      if(num1 % 2 ==0){
    System.out.println(num1+ "es un numero par");
         }else
         {
    System.out.println(num1+ " es un numero impar");
         }
   }
 }
