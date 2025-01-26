package VehicleManagementSystem;

public class Bike extends Vehicle implements Insurable{
    private final double insuranceRate;
    private final String insurancePolicyNumber;
    // Getting bike details
    Bike(int vehicleNumber, String type, double rate,double insuranceRate, String insurancePolicyNumber){
        // take parent information as constructor is already declared in the parent class
        super(vehicleNumber,type,rate);
        // Values which is used to get the insurance details
        this.insuranceRate = insuranceRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
        Vehicle.totalVehicle.add(this);
    }
    // Override the implementation according to the vehicle type
    @Override
    void calculateRentalCost(int days) {
        System.out.println("Yor rental cost is " + (getRentalRate() * days));
        System.out.println("Vehicle Information");
        System.out.println("Your vehicle number is " + getVehicleNumber() + "\nType of vehicle " + getType());
        System.out.println("-----------------------------------");
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Insurance cost is " + (insuranceRate * getRentalRate()));
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance policy number is " + insurancePolicyNumber;
    }
}
