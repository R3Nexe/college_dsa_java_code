import java.util.Scanner;
public class a1q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("number of rows: ");
        int rows= sc.nextInt();
        System.out.print("number of columns: ");
        int columns= sc.nextInt();
        int matrix[][]= new int[3][3];

        System.out.println("enter element");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j]=sc.nextInt();
        }
    }
    int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i==j) {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("sum of elements on the major diagonal is "+sum);
    }
}
