
import java.util.Scanner;

public class a1q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your weight in kgs: ");
        double weight = sc.nextDouble();
        System.out.print("enter your height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        String index[] = {"underweight", "Normal weight", "overweight", "obese"};
        if (BMI < 18.5) {
            System.out.printf("you are %s", index[0]);

        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.printf("you are %s", index[1]);

        } else if (BMI >= 25.0 && BMI < 30) {
            System.out.printf("you are %s", index[2]);

        } else {
            System.out.printf("you are %s", index[3]);
        }
    }
}
