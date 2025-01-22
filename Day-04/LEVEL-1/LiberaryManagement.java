import java.util.ArrayList;

public class LiberaryManagement{
    public static void main(String[] args) {
        Book omni = new Book("Omni", "TATA");
        System.out.println(omni.toString());
    }
}

class Liberary{
    private ArrayList<Book> Books;

    // Constructor to initialize the attributes
    Liberary(String name, Book book){
        this.Books.add(book);
    }

    //Method to add new book
    void addBook(Book book){
        Books.add(book);
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

    public String toString(){
        return "Book [Title - " + title + ", author - "+ author + " ]";
    }
    
}