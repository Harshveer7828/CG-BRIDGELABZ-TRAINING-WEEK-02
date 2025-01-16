public class Employee{
    // Decalring usefull attributes
    String name;
    String id;
    int salary;

    // Constructor to intialize the parameters
    Employee(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display the details of the employee
    void displayDeails(){
        System.out.println("Name of the employee is :- "+ name +"\nId of the employee is :- "+ id
        +"\nSalary is :- "+ salary);
    }


    public static void main(String[] args) {
        Employee details = new Employee("Harsh veer singh","0111AL211068",5000000);
        details.displayDeails();
    }
}