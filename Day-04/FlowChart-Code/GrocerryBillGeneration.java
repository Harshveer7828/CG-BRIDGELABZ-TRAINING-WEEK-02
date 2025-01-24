import java.util.ArrayList;

public class GrocerryBillGeneration{
    
}

class Customer{
    private String customerId;
    private ArrayList<Product> products;

    // Constructor to set the name
    Customer(String name){
        this.customerId = name;
        this.products = new ArrayList<>();
    }

    public String getCustomerId(){
        return customerId;
    } 

    void addProduct(Product product){
        products.add(product);
    }




}

class Product{

}

class BillGenerator{

}