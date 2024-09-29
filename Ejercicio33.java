import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena que represente un número entero: ");
        String cadena = scanner.nextLine();
        scanner.close();
        
        try {
            
            int numero = Integer.parseInt(cadena);
            
            
            int resultado = numero + 10;
        
            System.out.println("El resultado de sumar 10 es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("La cadena introducida no es un número entero válido.");
        }
    }
}