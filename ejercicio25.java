import java.util.Scanner;
public class ejercicio25

 {
    public static void main(String[] args) {
        int fila;
        int i,j;
 Scanner scanner= new Scanner(System.in);
 System.out.println("ingrese el número de filas ");
       fila=scanner.nextInt();
  
  for(i=1; i<=fila; i++){
    for(j=1; j<=i;j++){
      System.out.print("*");
    }
    System.out.println("");
  }
  

 }
}
 