package chapter4;

import java.util.Scanner;

/*
*FOR LOOP
* Write a cashier program that will scan a given number of items and 
*tally the cost.
*/

public class Cashier {
    public static void main(String[] args) {
        //Get the number of items from the user
        System.out.println("Enter the number of items: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        scanner.close();

        double total = 0.0;

        //Create loop to iterate through all of the items and accumulate the total cost
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of item ");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("The total cost is: " + total);
    }

}
