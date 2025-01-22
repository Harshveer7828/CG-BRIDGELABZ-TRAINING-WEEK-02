import java.util.ArrayList;

public class SchoolManagement {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenwood High");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses (Association)
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);

        student2.enrollInCourse(course1);

        // View courses each student is enrolled in
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        // View students enrolled in each course
        course1.viewEnrolledStudents();
        course2.viewEnrolledStudents();
    }
}

// School class (Aggregation with Students)
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been added to " + name);
    }

    // Getter for school name
    public String getName() {
        return name;
    }
}

// Student class (Association with Courses)
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Add the student to the course
        System.out.println(name + " has enrolled in " + course.getName());
    }

    // View courses the student is enrolled in
    public void viewEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    // Getter for student name
    public String getName() {
        return name;
    }
}

// Course class (Association with Students)
class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // View students enrolled in the course
    public void viewEnrolledStudents() {
        System.out.println("The following students are enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    // Getter for course name
    public String getName() {
        return name;
    }
}
