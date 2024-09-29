
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tama;
        int[] array;
        System.out.print("Ingrese el tamaño del array: ");
        tama = scanner.nextInt();
        array = new int[tama];

        System.out.println("Ingrese los valores del array:");
        for (int i = 0; i < tama; i++) {
            array[i] = scanner.nextInt();
        }

        // Invertir el array
        for (int i = 0; i < tama / 2; i++) {
            int temp = array[i];
            array[i] = array[tama - 1 - i];
            array[tama - 1 - i] = temp;
        }

        // Mostrar el array invertido
        System.out.println("El array invertido es:");
        for (int i = 0; i < tama; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}