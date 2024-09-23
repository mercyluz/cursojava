import java.util.Scanner;
public class ejercicio27

 {
    public static void main(String[] args) {
        
 Scanner scanner= new Scanner(System.in);
 
 int i, mayor =0, fila;
 
 System.out.println("ingrese el valor de la fila");
 fila= scanner.nextInt();
 int[] array= new int[fila];
  for(i=0; i< fila; i++){
    
      System.out.print("ingresa un numero");
      array[i] = scanner.nextInt();
    }
    for(i=1; i < fila; i++){
        if (array[i] > mayor){
            mayor = array[i];
            mayor=array[i];
        
    
    System.out.println("");
  }
}
System.out.println("el numero mayor es" + mayor);
 }
}