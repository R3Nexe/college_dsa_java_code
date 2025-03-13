
import java.util.Scanner;

public class a1hq4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of rows: ");
        int row = sc.nextInt();

        System.out.print("number of columns: ");
        int column = sc.nextInt();

        int matrixA[][] = new int[row][column];
        int matrixB[][] = new int[row][column];
        int matrixC[][] = new int[row][column];

        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
