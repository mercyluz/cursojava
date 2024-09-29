import java.util.Scanner;

public class Ejercicio30 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        scanner.close();
        
        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
      String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
        
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }
}