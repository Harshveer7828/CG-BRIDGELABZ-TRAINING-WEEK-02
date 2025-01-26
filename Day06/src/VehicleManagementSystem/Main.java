package VehicleManagementSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(45615, "4 Wheeler", 2500, 100, "Mp22M");
        Bike bike = new Bike(125, "2 Wheeler", 100, 10, "MP047076");
        System.out.println("Total vehicle are as follows :- \n------------------------");
        for (Vehicle vehicle:Vehicle.totalVehicle){
            System.out.println("Vehicle Number:- " + vehicle.getVehicleNumber() + "\nVehicle Type:- "+ vehicle.getType() +
                    "\nVehicle Insurance :- "+ vehicle.getInsuranceDetails());
            System.out.println("------------------------");
        }


    }
}
