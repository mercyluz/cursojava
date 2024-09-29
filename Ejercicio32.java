import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        scanner.close();
        
        int numeroDeVocales = contarVocales(cadena);
        System.out.println("El número de vocales en la cadena es: " + numeroDeVocales);
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                contador++;
            }
        }
        
        return contador;
    }
}