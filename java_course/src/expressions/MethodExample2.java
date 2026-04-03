package expressions;

public class MethodExample2 {

    public static void main(String[] args) {
        int sum = add(100, 200);
        System.out.println(sum);
    }

    private static int add(int a, int b) {
        return a + b;
    }

}
