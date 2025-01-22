import java.util.ArrayList;
import java.util.List;

// Class Faculty
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class Department
class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

// Class University
class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Mehtod to add the department in the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Mehtod to add the faculty in the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Mehtod to show the department oin the university

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.getDepartmentName());
        }
    }

    // Method to display the faculty member
    public void showFaculty() {
        System.out.println("Faculty members in " + name + ":");
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty.getName());
        }
    }

    // Deleting the university by clearing the list
    public void deleteUniversity() {
        departments.clear();
        System.out.println(name + " University and all its departments have been deleted.");
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a university
        University university = new University("Tech University");

        // Creating departments
        Department department1 = new Department("Computer Science");

        // Adding departments to the university
        university.addDepartment(department1);

        // Creating faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");

        // Adding faculty members to the university
        university.addFaculty(faculty1);

        // Display departments and faculty members
        university.showDepartments();

        // Delete the university and its departments
        university.deleteUniversity();

        System.out.println(faculty1.getName());
    }
}
