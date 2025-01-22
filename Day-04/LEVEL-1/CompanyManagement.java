import java.util.ArrayList;

// Company class
class Company {
    private ArrayList<Department> departments;

    // Constructor
    public Company() {
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    } 
    
}

// Department class with composition of Employee
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Show department details with employees
    public void showDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    // Delete all employees when the department is deleted 
    public void deleteEmployees() {
        employees.clear();  
    }
}

// Employee class
class Employee {
    private String employeeName;
    private String position;

    // Constructor
    public Employee(String employeeName, String position) {
        this.employeeName = employeeName;
        this.position = position;
    }

    // Show employee details
    public void showEmployeeDetails() {
        System.out.println("Employee: " + employeeName + ", Position: " + position);
    }
}

// Main class to test the composition relationship
public class CompanyManagement {
    public static void main(String[] args) {
        // Creating company
        Company company = new Company();

        // Creating departments
        Department development = new Department("Development");
        Department hr = new Department("People");

        // Creating employees for development department
        Employee harshveer = new Employee("Harsh veer singh", "Software Engineer");
        Employee om = new Employee("Om Tiwari", "Peune's head");

        // Adding employees to departments
        development.addEmployee(harshveer);
        development.addEmployee(om);


        // Adding departments to company
        company.addDepartment(development);
        company.addDepartment(hr);
        

    }
}
