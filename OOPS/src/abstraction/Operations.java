package abstraction;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("| BEVERAGE MACHINE IS TURNING ON |");
        System.out.println("==================================");
        System.out.println();

        boolean flag = true;

        while(flag) {
            System.out.println("""
                    What you want to Prepare?
                    1. Hot Tea?
                    2. Warming Coffee
                    3. Healthy Juice
                    4. Off 
                    Enter your choice of drink...
                    """);

            int choice =  sc.nextInt();

            switch(choice) {
                case 1:
                    Tea tea = new Tea(20, true, 10, 30, true);

                    tea.display();
                    tea.prepareDrink();
                    break;

                case 2:
                    Coffee coffee = new Coffee(20, true, 10, true, 50);
                    coffee.display();
                    coffee.prepareDrink();
                    break;

                case 3:
                    Juice juice = new Juice(20, false, 10, 10);
                    juice.display();
                    juice.prepareDrink();
                    break;

                case 4:
                    System.out.println("Thank-you for using");
                    System.out.println("Turning Off");
                    flag = false;

                default:
                    System.out.println("OOPs, No options. Try again");
            }

        }
    }
}
