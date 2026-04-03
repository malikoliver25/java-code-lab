package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String arg[]) {
        //Get the test score
        System.out.println("What was your test score?");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
       char letterGrade;
        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        //Display the letter grade
        System.out.println("Your letter grade is: " + letterGrade);
        scanner.close();

    }

}
