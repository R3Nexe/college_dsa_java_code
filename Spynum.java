
import java.util.Scanner;

public class a1q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while (num > 0) {
            int d = num % 10;
            sum += d;
            prod *= d;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not Spy number");
        }
    }
}
