import java.util.ArrayList;
import java.util.List;

// Class Cource
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    // Constructor to intialize the values
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }else System.out.println("Already enrolled in ths cource");
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}


class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
// Method to show the enrolled in courses
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }
    }
    // Method to show the enrolled courses
    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }
}


class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
    
        School school = new School();

        // Create students
        Student student1 = new Student("Alice");

        // Add students to the school
        school.addStudent(student1);

        // Create courses
        Course math = new Course("Math");

        // Enroll students in courses
        student1.enrollInCourse(math);
       
        // Demonstrate functionality
        student1.showEnrolledCourses();
        
    }
}
