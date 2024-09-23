import java.util.Scanner;
public class ejercicio24

 {
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int num;
   int factorial= 1;
 System.out.println("Ingresa un numero " );
 num=scanner.nextInt();
 
 for (int i = 1; i <= num; i++){
 factorial = factorial * i;
 }
System.out.println("El factorial de ; " +num+ " es "  +factorial);
}
 }
 