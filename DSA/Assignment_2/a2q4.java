class Deposit {
    private long principal;
    private int time;
    private double rate;
    private double totalAmt;

    Deposit() {
        principal = 0;
        time = 0;
        rate = 0;
        totalAmt = 0;
    }

    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 0; 
    }

    Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time = 0; 
    }

    void calcAmt() {
        totalAmt = principal + (principal * rate * time) / 100;
    }

    void display() {
        System.out.println("Principal amount: " + principal);
        System.out.println("Time period: " + time + " years");
        System.out.println("Rate of interest: " + rate + "%");
        System.out.println("Total amount: " + totalAmt);
        System.out.println("----------------------------------");
    }
}

public class a2q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        d1.calcAmt(); 
        d1.display();

        Deposit d2 = new Deposit(10000, 5, 5.0);
        d2.calcAmt();
        d2.display();

        Deposit d3 = new Deposit(5000, 3);
        d3.calcAmt(); 
        d3.display();

    
        Deposit d4 = new Deposit(20000, 4.5);
        d4.calcAmt(); 
        d4.display();
    }
}
