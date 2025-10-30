package encapsulation;

public class Employee {
    private static int eId = 1;
    private int empId;
    private String name;
    private String address;
    private String phnNo;
    private String designation;
    private double salary;

    public Employee(String name, String address, String phnNo, String designation, double salary) {
        this.empId = eId++;
        this.name = name;
        this.address = address;
        this.phnNo = phnNo;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
