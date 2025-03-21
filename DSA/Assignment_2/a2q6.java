
abstract class Marks {

    double markICP;
    double markDSA;
    double percentage;

    abstract void getMarks();
}

class CSE extends Marks {

    double algoDesign;

    CSE(double markICP, double markDSA, double algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }

    @Override
    void getMarks() {
        System.out.println("percentage= " + (markDSA + markICP + algoDesign) / 90 * 100);

    }

}

class NonCSE extends Marks {

    double enggMechanics;

    NonCSE(double markICP, double markDSA, double enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }

    @Override
    void getMarks() {

        System.out.println("percentage= " + (markDSA + markICP + enggMechanics) / 90 * 100);
    }
}

public class a2q6 {

    public static void main(String[] args) {
        CSE s1 = new CSE(28, 20, 15);
        NonCSE s2 = new NonCSE(27, 15, 23);
        s1.getMarks();
        s2.getMarks();
    }
}
