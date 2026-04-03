package chapter11;

public abstract class Shape {

     abstract double calculateArea();

     public void printArea() {
          System.out.println("The area of the shape is: " + calculateArea());
     }

}
