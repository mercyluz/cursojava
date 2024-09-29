import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int num;
   int suma;
   int i;
   i=1;
   suma=0;

 System.out.println("Ingresa un numero " );
 num=scanner.nextInt();
 
 while (i<=num)  {   
 suma +=i;
 i++;
 }  
System.out.println("la suma de los n numeros es" + suma);
}
 }
