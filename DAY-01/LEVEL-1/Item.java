public class Item {
    
    //create attributes
    int itemCode;
    String itemName;
    int price;

    //create a constructor
    Item(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //Display Details
    void displayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    //Calculate total cost
    void calculateTotalCost(int quantity){
        System.out.println("Total Cost: " + price * quantity);
    }

    public static void main(String[] args) {
        
        //Create an object of the Item class
        Item item = new Item(101, "Laptop", 50000);
        item.displayDetails();
        item.calculateTotalCost(2);
    }
}