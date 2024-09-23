import java.util.Scanner;
public class ejercicio20

 {
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int num;
   

 System.out.println("Ingresa un numero " );
 num=scanner.nextInt();
 if (num>0 && num % 2 == 0){
    System.out.println("eres positivo y par");
 }
 else 
    if (num <0 ||num % 3 == 0){
    System.out.println("el numero es negativo  o divisible por 3");
 }
 else{
    System.out.println("el numero no cumple con ninguna de las condiciones");
 }
    }
    }

 