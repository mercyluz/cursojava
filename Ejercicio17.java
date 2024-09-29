import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
   int num1, num2,operacion,respuesta;
 System.out.println("Ingresa el primer numero  " );
 num1=scanner.nextInt();
 System.out.println("Ingresa el segundo numero  " );
 num2=scanner.nextInt();
  System.out.println("teclee la opción correspondiente");
  System.out.println("1. Suma 2. Resta 3. Multiplicacion 4. Disvisión");
  respuesta=scanner.nextInt();
 switch(respuesta){
    case 1:
    operacion=num1+num2;
    System.out.println("la suma es igual a" + operacion);
    break;
    case 2:
    operacion=num1-num2;
    System.out.println("la resta es igual a" + operacion);
    break;
    case 3:
    operacion=num1*num2;
    System.out.println("la multiplicación es igual a" + operacion);
    break;
    case 4:
    operacion=num1/num2;
    System.out.println("la división es igual a" + operacion);
 }
 
 }
 }
 
