
import java.util.Scanner;

public class a1q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number greater than 2");
        int num = sc.nextInt();
        int count = 0;
        int rep = num;
        if (num > 0) {
            while (num > 2) {
                num /= 2;
                count++;
            }
            System.out.printf("the number of times %d can be repeatedly divided by 2 is %d", rep, count);
        }
    }
}
