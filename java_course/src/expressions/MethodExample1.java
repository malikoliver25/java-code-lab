package expressions;

public class MethodExample1 {

    public static void main(String[] args) {
        CalculateArea(5, 3.14);
    }

    public static void CalculateArea(double radius, double pi){
        double result = radius * pi;
        System.out.println("The area of the circle is " + result);
    }
}
