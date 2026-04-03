package chapter1;

public class LogicalOperators {

    public static void main(String[] args) {
        int age = 19;
        if(age > 18);
        {
         //   System.out.println("You are an adult.");
        }

        String gender = "Male";
        if(gender.equals("Male")){
         //   System.out.println("You are a male.");
        }

        if(age>18 && gender.equals("Male")){
            System.out.println("You are an adult male.");
        }

    }
}
