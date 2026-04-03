package loop;

public class ForLoop {

    public static void main(String[] args) {
        // for loop syntax:
        // for (initialization; condition; update) {
        //     // code to be executed
        // }

        // Example: Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Example: Print even numbers from 0 to 10
        for (int j = 0; j <= 10; j += 2) {
            System.out.println(j);
        }

        // Example: Print the first 10 Fibonacci numbers
        int a = 0, b = 1;
        for (int k = 0; k < 10; k++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}

