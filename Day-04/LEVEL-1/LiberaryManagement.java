import java.util.ArrayList;
import java.util.List;

public class LiberaryManagement{
    public static void main(String[] args) {
        Liberary lib1 = new Liberary("LIB1");
        Book omni = new Book("Omni", "TATA");
        lib1.addBook(omni);
        System.out.println(omni.toString());
    }
}

class Liberary{
    private List<Book> Books;
    private String name;

    // Constructor to initialize the attributes
    Liberary(String name){
        this.name = name;
        this.Books = new ArrayList<>();
    }

    //Method to add new book
    void addBook(Book book){
        Books.add(book);
    }

    //Getter to get the private values
    public String getName(){
        return name;
    }

    
    

}

class Book{
    private String title;
    private String author;

    //Constructor for intializing the values
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //Getter method to get the private values
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }
}