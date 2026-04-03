package chapter3;

import java.util.Scanner;

/* IF Statement.
All salespeople get a base salary of $1000 a week.
Salespeople who exceed 10 sales get a bonus of $250.*/
public class SalaryCalculator {
    
    public static void main(String[] args) {
      
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary += bonus;
        }

        //Output the results
        System.out.println("The employee's salary for the week is: $" + salary);
    }

}
