package encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actions {

    static Scanner sc = new Scanner(System.in);
    List<Employee> employeeList = new ArrayList<>();

    public void addEmployee() {
        System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Address: ");
        String address = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phnNo = sc.next();
        sc.nextLine();

        System.out.print("Enter designation: ");
        String designation = sc.nextLine();

        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(name, address, phnNo, designation, salary);
        employeeList.add(employee);
    }

    public void displayAllEmployeeDetails() {
        for(Employee employee : employeeList) {
            System.out.println("Employee ID: E00" + employee.getEmpId());
            System.out.println("Employee name: " + employee.getName());
            System.out.println("Employee Phone Number: " + employee.getPhnNo());
            System.out.println("Employee Designation: " + employee.getDesignation());
            System.out.println("Employee Salary: " + employee.getSalary());
            System.out.println();
        }
    }

    public boolean displayEmployeeById(int id) {
        for(Employee employee : employeeList) {
            if(employee.getEmpId() == id) {
                System.out.println("Employee ID: E00" + employee.getEmpId());
                System.out.println("Employee name: " + employee.getName());
                System.out.println("Employee Phone Number: " + employee.getPhnNo());
                System.out.println("Employee Designation: " + employee.getDesignation());
                System.out.println("Employee Salary: " + employee.getSalary());
                return true;
            }
        }

        return false;
    }
}
