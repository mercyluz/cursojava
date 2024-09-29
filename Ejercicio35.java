import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num = 0;
        System.out.println("Ingresa números enteros :");

        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            numeros.add(num);
            suma += num;
        }

        System.out.println("Números ingresados: " + numeros);
        System.out.println("Suma de los números: " + suma);
    }
}