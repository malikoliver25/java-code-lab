package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("What is your letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        switch(grade){
            case "A":
                System.out.println("Excellent work!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("You can do better.");
                break;
            case "D":
                System.out.println("You need to work harder.");
                break;
            case "F":
                System.out.println("You failed. Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }
        scanner.close();
    }
}
