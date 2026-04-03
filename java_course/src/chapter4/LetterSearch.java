package chapter4;

import java.util.Scanner;

/*
*LOOP BREAK
* Search a String if it contains the letter 'a'.
*/

public class LetterSearch {
    public static void main(String[] args) {
        
        //Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        //Search for letter 'a'
        for (int i = 0; i < text.length();) {
            if (text.charAt(i) == 'a') {
                System.out.println("The letter 'a' was found at index " + i);
            }
                else {
                    System.out.println("The letter 'a' was not found at index " + i);
                }
                break;
        }
    }
}
