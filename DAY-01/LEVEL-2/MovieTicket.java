public class MovieTicket {
    
    //create attributes
    String movieName;
    int seatNumber;
    int price;

    //create constructor
    MovieTicket(String movieName, int SeatNumber, int price){
        this.movieName = movieName;
        this.seatNumber = SeatNumber;
        this.price = price;
    }

    //create a method to display the ticket details
    void displayTicketDetails(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        
        //Create an object of the MovieTicket class
        MovieTicket ticket = new MovieTicket("Avengers : Endgame", 101, 5500);
        ticket.displayTicketDetails();

    }
}