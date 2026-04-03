package chapter4;

import java.util.Scanner;

/*
* WHILE LOOP
* Each store employee makes $15 an hour. Write a program that allows the 
 * employee to enter the number of hours worked for the week. Do not 
 * allow overtime (more than 40 hours). */

public class GrossPayInputValidation {
    public static void main(String[] args) {
       //Initializing variables
       int rate = 15;
       int maxHours = 40;

       //Get input for unknown variables
         System.out.println("Enter the number of hours worked for the week: ");
         try (Scanner scanner = new Scanner(System.in)) {
            double hoursWorked = scanner.nextDouble();

             //Input validation
             while (hoursWorked > maxHours) {
                System.out.println("Overtime is not allowed. Please enter a valid number of hours: ");
                hoursWorked = scanner.nextDouble();
             }
             scanner.close();

                //Calculate gross pay
                double grossPay = hoursWorked * rate;
                System.out.println("Gross pay for the week: $" + grossPay);
        }

    }

}

