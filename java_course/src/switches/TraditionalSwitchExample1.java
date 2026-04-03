package switches;

public class TraditionalSwitchExample1 {

    public static void main(String[] args) {
        String Branch = "ECE";
        int year = 2;
        switch(year) {
            case 1:
                System.out.println("elective courses : Advance english, Algebra ");
                break;
                case 2:
                    switch(Branch) {
                        case "CSE":
                        case "CCE":
                            System.out.println("elective courses : Machine Learning, Big Data");
                            break;
                        case "ECE":
                            System.out.println("elective courses : VLSI, Signal Processing");
                            break;
                            default:
                                System.out.println("elective courses : Unknown Branch");
                                break;
                    }
        }

    }
}
