public class Product {
    private String productName;
    private double price;
    private static int totalProducts;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p = new Product("tesr",20);
        Product p1 = new Product("tesr",20);
        p.displayProductDetails();
        displayTotalProducts();
    }
}