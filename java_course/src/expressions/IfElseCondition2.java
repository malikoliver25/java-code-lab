package expressions;

public class IfElseCondition2 {

    public static void main(String[] args) {
        int letter = 'a';
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The letter is a vowel");
        }
        else{
            System.out.println("The letter is not a vowel");
        }
    }
}
