
class Complex {

    double real;
    double imag;

    void setData(double r, double c) {
        real = r;
        imag = c;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public Complex add(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
}

public class a2q2 {

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.setData(11.2, -12.4);
        c2.setData(1.2, 4.4);
        Complex c3 = new Complex();
        c3 = c3.add(c1, c2);
        c3.display();
    }

}
