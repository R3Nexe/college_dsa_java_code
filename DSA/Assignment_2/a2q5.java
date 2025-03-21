
class Person{
    String name;
    int age;
    
}
class Employee extends Person{
    int Eid;
    int salary;
    Employee(String name, int age,int Eid, int salary){
        this.name=name;
        this.age=age;
        this.Eid=Eid;
        this.salary=salary;
    }
    void empDisplay(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("Employee Id: "+Eid);
        System.out.println("Employee salary: "+salary);
    }
}

public class a2q5 {
    public static void main(String[] args) {
        Employee e1=new Employee("nishant", 20, 1211, 3500000);
        e1.empDisplay();
    }
}
 