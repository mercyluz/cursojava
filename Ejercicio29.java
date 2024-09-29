
import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fila, column;

        do {
            System.out.print("Número de filas: ");
            fila = scanner.nextInt();
        } while (fila < 1);
        do {
            System.out.print("Número de columnas: ");
            column = scanner.nextInt();
        } while (column < 1);

        
        int[][] A = new int[fila][column];
        int[][] B = new int[fila][column];
        int[][] C = new int[fila][column];

       
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\n la suma de la matriz es:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }
}