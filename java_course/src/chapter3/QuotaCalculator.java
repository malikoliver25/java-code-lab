package chapter3;

import java.util.Scanner;

/*
IF ELSE
* All salespeople are expected to meet a sales quota of 10 units per week.
* For those who do, they recieve a congradulatory message.
* For those who don't, they are informed of how many more sales they needed to meet the quota.
*/
public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize known values
        int quota = 10;

        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - output
        if (sales >= quota) {
            System.out.println("Congratulations! You met your sales quota for the week.");
        } else {
            int shortfall = quota - sales;
            System.out.println("You needed " + shortfall + " more sales to meet your quota for the week.");
        }
    }

}
