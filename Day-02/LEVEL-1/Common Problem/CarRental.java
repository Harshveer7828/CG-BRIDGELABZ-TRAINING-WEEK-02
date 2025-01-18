public class CarRental {
    private String customerName;
    private int carModel;
    private int rentalDays;
    private int rentalCost;

    CarRental(String customerName, int carModel, int rentalDays,int rentalCost) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        rentalCost = calculateCost(rentalCost);
    }

    // method to calculatethe cost price
    public int calculateCost(int rentalCost) {
        return rentalCost * rentalDays;
    }
    void displayCost() {
        System.out.println("The cost of the car rental is: " + calculateCost(rentalCost));
    }

    public static void main(String[] args) {
        CarRental car1 = new CarRental("Audi",2018,2,2000);
        car1.displayCost();
    }

}