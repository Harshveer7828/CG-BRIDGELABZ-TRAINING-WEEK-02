
public class Circle {
    // Create the usefull attributes
    int radius;

    //Constructor to intialize the values
    Circle(int radius){
        this.radius = radius;
    }

    //Method to display the area of circle
    void display(){
        System.out.println("Area of Circle of radius is "+this.radius + " is "+ Math.PI * Math.pow(radius,2 ));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.display();
    }

}
