
import java.util.Random;

public class a1hq5 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(2);  
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int maxRow = 0;
        int maxRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRow = i;
            }
        }

        int maxCol = 0;
        int maxColCount = 0;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxCol = j;
            }
        }

        System.out.println("The row with the most 1s is: " + maxRow);
        System.out.println("The column with the most 1s is: " + maxCol);
    }
}
