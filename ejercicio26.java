import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
       int fila1;
       int colum1;
       int colum2;
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la primera matriz: ");
        fila1  = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz (y filas de la segunda matriz): ");
        colum1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        colum2 = scanner.nextInt();

       
        int[][] matriz1 = new int[fila1][colum1];
        int[][] matriz2 = new int[colum1][colum2];
        int[][] result = new int[fila1][colum2];
        System.out.println("Ingresa los valores de la primera matriz:");
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < colum1; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingresa los valores de la segunda matriz:");
        for (int i = 0; i < colum1; i++) {
            for (int j = 0; j < colum2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < colum2; j++) {
                for (int k = 0; k < colum1; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println(" La multiplicación de matrices es:");
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < colum2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}