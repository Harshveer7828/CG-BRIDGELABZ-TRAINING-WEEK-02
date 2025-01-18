public class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        // Default value
        this(0.1);
    }

    // Parametrized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Get the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Method to display the area of circle
    public void displayArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.displayArea();

    }
}
