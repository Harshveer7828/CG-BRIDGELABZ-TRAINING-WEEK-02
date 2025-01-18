public class Book {
    
    //Create attributes 
    String title;
    String author;
    int price;
    // create a default contructor 
    Book() {
        title = "Three mens in a boat";
        author = "jerome k jerome";
        price = 199;
    }

    //Create a parametrized constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Display details 
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        
        //Create an object of the Book class
        Book book = new Book("Death : An Inside Story", "Sadhguru", 250);
        book.displayDetails();
        Book bk = new Book();
        bk.displayDetails();

    }
}