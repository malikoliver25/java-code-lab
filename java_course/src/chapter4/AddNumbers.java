package chapter4;

import java.util.Scanner;

/*
* DO WHILE LOOP
* Write a program that asks the user to enter two numbers and then adds
* them together. The program should continue to ask for numbers until
* they indicate they want to stop. */

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        boolean again = false;

        do {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            System.out.println("Do you want to add more numbers? (yes/no): ");
            String response = scanner.next();
            again = response.equalsIgnoreCase("yes");

        } while (again);

        scanner.close();
  }

}


