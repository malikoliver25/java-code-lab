package switches;

public class TraditionalSwitchExample {

    public static void main(String[] args) {
        int x = 2, y = 3;
        switch (x) {
            case 1:
                switch (y) {
                    case 2:
                        System.out.println("Good Morning!");
                        break;
                        case 3:
                            System.out.println("Good Afternoon!");
                            break;
                            default:
                                System.out.println("Good Evening!");
                }
                break;
                case 2:
                    switch (y) {
                        case 2:
                            System.out.println("Good Night!");
                            break;
                            case 3:
                                System.out.println("Good Morning!");
                                break;
                    }
                    break;
        }
    }
}
