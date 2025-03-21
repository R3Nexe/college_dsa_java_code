
import java.util.Scanner;

class Person {

    String name;
    int age;

    void setData(String n, int a) {
        name = n;
        age = a;
    }

    void displayData() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

class a2q1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2= new Person();
        p1.name = "Rohan";
        p1.age = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String n = sc.nextLine();
        System.out.println("enter age");
        int a = sc.nextInt();
        p2.setData(n, a);
        p2.displayData();
        System.out.println((p1.age > p2.age ? p1.name : p2.name) + " is older");

}
}