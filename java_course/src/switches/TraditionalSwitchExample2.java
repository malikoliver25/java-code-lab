package switches;

public class TraditionalSwitchExample2 {

    public static void main(String[] args) {
        char size = 'L', toppings = 'C';
        switch (size) {
            case 'S':
                switch (toppings) {
                    case 'P':
                        System.out.println("Small pizza with pepperoni");
                        break;
                    case 'C':
                        System.out.println("Small pizza with cheese");
                        break;
                    default:
                        System.out.println("Small pizza with no toppings");
                        break;
                }
                break;
            case 'M':
                switch (toppings) {
                    case 'P':
                        System.out.println("Medium pizza with pepperoni");
                        break;
                    case 'C':
                        System.out.println("Medium pizza with cheese");
                        break;
                    default:
                        System.out.println("Medium pizza with no toppings");
                        break;
                }
                break;
            case 'L':
                switch (toppings) {
                    case 'P':
                        System.out.println("Large pizza with pepperoni");
                        break;
                    case 'C':
                        System.out.println("Large pizza with cheese");
                        break;
                    default:
                        System.out.println("Large pizza with no toppings");
                        break;
                }
                break;
            default:
                System.out.println("Invalid pizza size");
                break;
        }
    }
}
