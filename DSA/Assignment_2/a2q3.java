
class Product {

    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0;

    void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price per unit: " + price + "Rs");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total for this product: " + (price * quantity) + "Rs");
        System.out.println("-------------------------------");
    }

    Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;

        totalPrice += price * quantity;
    }
}

public class a2q3 {

    public static void main(String[] args) {
        Product prod[] = new Product[5];
        for (int i = 0; i < prod.length; i++) {
            prod[0] = new Product(1, 22, 4);
            prod[1] = new Product(2, 12, 2);
            prod[2] = new Product(3, 2, 5);
            prod[3] = new Product(4, 220, 1);
            prod[4] = new Product(5, 99, 7);
        }
        for (int i = 0; i < 5; i++) {
            prod[i].display();
        }
        System.out.println("total price : " + Product.totalPrice + "Rs");
    }
}
