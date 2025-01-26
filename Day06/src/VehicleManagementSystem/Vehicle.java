package VehicleManagementSystem;

import java.util.ArrayList;

// Vehicle class which categorized all type of vehicle
public abstract class Vehicle implements Insurable{
    // Required attributes for vehicle
    private final int vehicleNumber;
    private final String type;
    private double rentalRate;
    abstract void calculateRentalCost(int days);
    public static ArrayList<Vehicle> totalVehicle = new ArrayList<>();

    //Constructor to store the vehicle information
    Vehicle(int vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
        this.type = type;
    }

    // Public getter and setter for fetching the rprivate values
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}
