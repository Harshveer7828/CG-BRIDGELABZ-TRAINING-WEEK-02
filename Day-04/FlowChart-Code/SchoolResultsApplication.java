import java.util.ArrayList;

// Subject class which defines a subject of each student
class Subject {
    private String name;
    private double score;

    // Constructor to get set the attributes
    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

//Student classs
class Student {
    private String name;
    private ArrayList<Subject> subjects;
    private int id;

    // Constructor Student class to set the name
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.subjects = new ArrayList<>();
    }


    // Getter to fetch the private attributes
    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    // Mehtod to add subject on a student class
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

// Grade calculor to calculate the grade of a student
class GradeCalculator {

    // Mehtod to calculate the grade of a student
    public String calculateGrade(Student student) {

        ArrayList<Subject> subjects = student.getSubjects();
        double totalScore = 0;

        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }

        double average = totalScore / subjects.size();

        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}

public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create a student
        Student harsh = new Student("Harsh veer singh", 22);

        // Creating multiple subjects for student
        Subject maths = new Subject("Maths", 50);
        Subject physics = new Subject("physics", 50);
        Subject science = new Subject("science", 50);
        
        // Add subject to the student
        harsh.addSubject(maths);
        harsh.addSubject(physics);
        harsh.addSubject(science);

        // Create a object to calculate the grade
        GradeCalculator calculator = new GradeCalculator();
        //Display the grade
        System.out.println(calculator.calculateGrade(harsh));
    }
}
