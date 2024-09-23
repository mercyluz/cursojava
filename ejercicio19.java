import java.util.Scanner;
public class ejercicio19

 {
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int edad;
   

 System.out.println("Ingresa tu edad " );
 edad=scanner.nextInt();
 if (edad>18){
    System.out.println("eres mayor de edad");
 }
 else {
    System.out.println("eres menor de edad");
 }
    }
}
 