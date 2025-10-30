package encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Actions action = new Actions();
        System.out.println("===================");
        System.out.println("Employee Records");
        System.out.println("===================");

        boolean flag = true;

        while(flag) {
            System.out.println();
            System.out.println("1. Add employee");
            System.out.println("2. Display all employee");
            System.out.println("3. Display employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = new Scanner(System.in).nextInt();

            switch(choice) {
                case 1:
                    action.addEmployee();
                    break;

                case 2:
                    action.displayAllEmployeeDetails();
                    break;

                case 3:
                    System.out.print("Enter Employee Id to search: ");
                    boolean status = action.displayEmployeeById(new Scanner(System.in).nextInt());

                    if(!status) {
                        System.out.println("No employee found with that Id");
                    }

                    break;

                case 4:
                    System.out.println("Exiting.......");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice.. PLease  try again!");
            }
        }
    }
}
