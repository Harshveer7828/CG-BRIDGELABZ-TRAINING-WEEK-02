public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    //Constructor type-Parametrized
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    //Getter method to get CGPA 
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(12,"harsh veer",0.120);
        student.displayStudentInfo();
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
   

}