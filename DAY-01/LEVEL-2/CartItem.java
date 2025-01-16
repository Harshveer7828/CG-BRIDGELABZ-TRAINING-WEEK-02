/* Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.
 */

public class CartItem {
    // Declaring the attributes
    String itemName;
    int price;
    int quantity;

    // Constructor to initialize the attributes
    CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to Add an item to the cart.
    void addToCart(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to remove an item to the cart.
    void removeItem(String itemName, int price, int quantity) {
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
    }

    // method to display the details
    void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price * quantity);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop macbook", 120000, 2);
        cart.displayDetails();
    }

}
