package expressions;

public class ExperState {

    public static void main(String[] args) {
        double miles = (70 * 0.621371);
        String x = (miles > 3.0) ? "You have run more than 3 miles!" : "You have run less than 3 miles.";
        System.out.println(x);
    }
}
