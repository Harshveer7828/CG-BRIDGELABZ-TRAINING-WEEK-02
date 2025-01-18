public class Course {
    private String courseName;
    private int duration;
    private double fee;
    public static String instituteName;

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee:" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name is changed to:" + newInstituteName);
    }
    public static void main(String[] args) {
        Course c = new Course("instituteName",10, 4.2);
        c.displayCourseDetails();
        updateInstituteName("Capgemini");

    }
}
