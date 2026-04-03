package loop;

// Testing Debugger

public class ForLoopExample {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1500; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                System.out.println("Numbers divisible by 7 and 11 are: " + i);
                count++;
            }
            if (count == 5) {
                break;
            }
        }
    }
}
