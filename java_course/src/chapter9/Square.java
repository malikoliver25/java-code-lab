package chapter9;

public class Square extends Rectangle {

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }

    public void print() {
        System.out.println("I am a square with side " + length);
    }

}



