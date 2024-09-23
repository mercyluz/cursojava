import java.util.Scanner;
public class ejercicio26

 {
    public static void main(String[] args) {
        
 Scanner scanner= new Scanner(System.in);
 
 int i,j, mayor =0;
 int[] fila= new int[z];
 System.out.println("ingrese el valor de la fila");
 z= scanner.nextInt();
  for(i=0; i< fila.length; i++){
    for(j=0; j<=i;j++){
      System.out.print("ingresa un numero");
      fila[i] = scanner.nextInt();
    }
    for(i=0; i < fila.length; i++){
        if (fila[i] > mayor){
            mayor = fila[i];
            j=1;
        }
    }
    System.out.println("");
  }
}
System.out.println("el numero mayor es" + mayor);
System.out.println("se encuentra en la posición" +(j+i));
 }
 