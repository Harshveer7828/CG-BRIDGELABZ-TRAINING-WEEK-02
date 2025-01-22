import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

public class EcommercePlatForm {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 1200.00);

        // Creating a customer
        Customer customer = new Customer("John Doe");

        // Creating orders
        Order order1 = new Order(1, customer);
        order1.addProduct(product1);

        // Customer places orders
        customer.placeOrder(order1);

        // Displaying customer orders and their details
        customer.showOrders();
    }
}
