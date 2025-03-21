package academics;
import java.util.Scanner;

class Student {

    String name;
    int roll;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name");
        name = sc.nextLine();
        System.out.println("enter roll number ");
        roll = sc.nextInt();
    }
    void showDetails(){
        System.out.println("name: "+name);
        System.out.println("roll number: "+roll);
    }
}

