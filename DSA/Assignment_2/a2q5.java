// Abstract base class
abstract class Shape {
    abstract double getArea();
}

// Square class
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}

// Triangle class
class Triangle extends Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

// Circle class
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class ShapeAreaDemo {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 6);
        Shape circle = new Circle(3);

        System.out.println("Square area: " + square.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Circle area: " + circle.getArea());
    }
}
