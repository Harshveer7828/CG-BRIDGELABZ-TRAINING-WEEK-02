package EmployeeManagementSystem;

import java.util.ArrayList;

public abstract class Employee {
    // Required attributes to store the employee details
    private String employeeId;
    private long baseSalary;
    private String name;
    public static ArrayList<Employee> employees;

    Employee(String employeeId, String name, long baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Public getter and setter for private attributes
    public String getName(){
        return name;
    }
    public String getEmployeeId(){
        return employeeId;
    }

    public void setBaseSalary(long baseSalary){
        this.baseSalary = baseSalary;
    }


}
