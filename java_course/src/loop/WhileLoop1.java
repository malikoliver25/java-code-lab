package loop;

public class WhileLoop1 {

    public static void main(String[] args) {
        int start = 5, end = 11;
        while (start <= end) {
            checkEvenNumber(start);
            start++;
        }
    }

    public static void checkEvenNumber(int n){
        if (n%2==0){
            System.out.println(n + " is an even number");

        }
        else{
            System.out.println(n + " is an odd number");
        }
    }
}
