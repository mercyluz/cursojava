import java.util.Scanner;
public class ejercicio23

 {
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int num;

 System.out.println("Ingresa un numero " );
 num=scanner.nextInt();
 
 for (int i = 1; i <= 12; i++){
 
System.out.println(num +"* " +i + "=" +(num*i));
}
 }
 }