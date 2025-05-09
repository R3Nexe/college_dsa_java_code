// Base class
class Vehicle {
    String model;
    int year;

    // Constructor
    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

// Derived class
class Car extends Vehicle {
    int carId;
    double price;

    // Constructor
    Car(String model, int year, int carId, double price) {
        super(model, year); // Call the base class constructor
        this.carId = carId;
        this.price = price;
    }

    // Method to display car details
    void carDisplay() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
        System.out.println("Car ID: " + carId);
        System.out.println("Car Price: $" + price);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Car object
        Car myCar = new Car("Tesla Model S", 2022, 101, 79999.99);

        // Display car and vehicle details
        myCar.carDisplay();
    }
}
