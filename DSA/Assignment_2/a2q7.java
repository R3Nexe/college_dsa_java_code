
interface DetailInfo {

    void display();

    void count();
}

class Person implements DetailInfo {

    static int maxcount = 0;
    String name;

    Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Person name= " + name);

    }

    public void count() {
        int charcount = name.length();
        System.out.println("the name has " + charcount + " characters");

        if (charcount > maxcount) {
            maxcount = charcount;
        }
    }

    static void displayCount() {
        System.out.println("count so far" + maxcount);
    }

}

public class a2q7 {

    public static void main(String[] args) {
        Person p1 = new Person("nishant");
        p1.display();
        p1.count();
    }
}
