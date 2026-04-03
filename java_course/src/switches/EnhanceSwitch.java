package switches;

public class EnhanceSwitch {

    public static void main(String[] args) {
        String levelString;
        int level = 1;
        levelString = switch (level) {
            case 1 -> "Beginner";
            case 2 -> "Intermediate";
            case 3 -> "Expert";
            default -> "Unknown";
        };
        System.out.println("Your level is: " + levelString);
    }
}
