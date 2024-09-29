import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int fila;
        int column;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Introduce el número de filas: ");
        fila = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        column = scanner.nextInt();
        
        int[][] matriz = new int[fila][column];
        
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < column; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int[][] transpuesta = new int[column][fila];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < column; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        // Mostrar la matriz transpuesta
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < fila; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}