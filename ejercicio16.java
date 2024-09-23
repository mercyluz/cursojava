import java.util.Scanner;
public class ejercicio16

 {
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int num1;
 System.out.println("Ingresa el año  " );
  num1 = scanner.nextInt();

 if((num1 % 4 == 0 && num1 % 100 != 0 ||(num1 % 400 == 0))){
    System.out.println(num1+ " es bisiesto");
 }else{
    System.out.println(num1+ " no es bisiesto");
 }
 }
 }
