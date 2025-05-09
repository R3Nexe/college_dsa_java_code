
class Book {
    private int bookId;
    private double price;
    private int quantity;
    private static double totalAmount = 0;

    // Parameterized constructor
    public Book(int bookId, double price, int quantity) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
        totalAmount += getTotalCost(); // update static variable
    }

    // Calculate total cost for this book
    public double getTotalCost() {
        return price * quantity;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
        System.out.println("---------------------------");
    }

    // Static method to get total amount spent
    public static double getTotalAmount() {
        return totalAmount;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create 5 different books
        Book[] books = new Book[5];
        books[0] = new Book(101, 250.50, 2);
        books[1] = new Book(102, 150.00, 1);
        books[2] = new Book(103, 325.75, 3);
        books[3] = new Book(104, 499.99, 1);
        books[4] = new Book(105, 120.00, 4);

        // Display details of each book
        System.out.println("Book Purchase Details:");
        System.out.println("=======================");
        for (Book book : books) {
            book.displayDetails();
        }

        // Display total amount spent
        System.out.println("Total Amount Spent on All Books: ₹" + Book.getTotalAmount());
    }
}
