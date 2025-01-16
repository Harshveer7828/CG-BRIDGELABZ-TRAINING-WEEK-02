// Program to Compute Area of a Circle Problem Statement:Write a program to create a Circle
// class with an attribute radius.Add methods to calculate and display the area and circumference of the circle.

public class Circle {
    // Create the usefull attributes
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    void display(){
        System.out.println("Area of Circle of radius is "+this.radius + " is "+ Math.PI * Math.pow(radius,2 ));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.display();
    }

}
