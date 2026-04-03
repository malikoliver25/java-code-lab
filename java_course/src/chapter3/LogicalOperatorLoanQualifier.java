package chapter3;

import java.util.Scanner;

/*
*Logical Operators
*To qualify for a loan, a person must have a salary of at least $30,000
* and have worked at their current job for at least 2 years.
*/

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
        //Initialize known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get unknown values
        System.out.println("What is your annual salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you been employed at your current job?");
        int yearsEmployed = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - output
        if (salary >= requiredSalary && yearsEmployed >= requiredYearsEmployed) {
            System.out.println("Congratulations! You qualify for the loan.");
        } else {
            if (salary < requiredSalary) {
                double salaryShort = requiredSalary - salary;
                System.out.println("Sorry, you need an annual salary of at least $" + salaryShort + " more to qualify for the loan.");
            }
            if (yearsEmployed < requiredYearsEmployed) {
                int yearsShort = requiredYearsEmployed - yearsEmployed;
                System.out.println("Sorry, you need to be employed for at least " + yearsShort + " more year(s) to qualify for the loan.");
            }
        }
    }

}
