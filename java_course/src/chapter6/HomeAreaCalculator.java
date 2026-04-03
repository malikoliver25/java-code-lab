package chapter6;

/*
* Write a class that creates instances of the Rectangle class to find
* total area of two rooms in a house
 */

public class HomeAreaCalculator {
    public static void main(String[] args) {
    
        /*
        Rectamgle 1
         */

        // Create an instance of the Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double area1 = room1.calculateArea();

        /*
        Rectangle 2
         */

        // Create another instance of the Rectangle class
        Rectangle room2 = new Rectangle();
        room2.setLength(30);
        room2.setWidth(75);
        double area2 = room2.calculateArea();

        // Calculate the total area
        double totalArea = area1 + area2;
        System.out.println("Total area of the two rooms is: " + totalArea);

    }
}