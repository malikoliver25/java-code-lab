package chapter1;

public class TernaryOperator {

    public static void main(String[] args) {
        int age = 20;
        String status;
        status = (age < 18) ? "Minor" : "Adult";
        System.out.println("You are an " + status + ".");
    }
}
