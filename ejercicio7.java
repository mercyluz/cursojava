import java.util.Scanner;
public class ejercicio7 {

    public static void main(String[] args) {
     
       int num1;
       int num2;
       int num3;
       int operacion;
       Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese el primer valor "  );
       num1 = scanner.nextInt();
       
       System.out.println("ingrese el segundo valor "  );
       num2 = scanner.nextInt();
 
       
       System.out.println("ingrese el tercer valor "  );
       num3 = scanner.nextInt();
       
       operacion= num1 + num2 * num3;
       System.out.println("resultado de la operacion es  " + operacion);
      
      
    }
}