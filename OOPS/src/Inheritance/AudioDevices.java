package Inheritance;

public class AudioDevices {
    private String brandName;
    private String color;
    private double price;
    private int yearsOfWarranty;

    public AudioDevices(String brandName, String color, double price, int yearsOfWarranty) {
        this.brandName = brandName;
        this.color = color;
        this.price = price;
        this.yearsOfWarranty = yearsOfWarranty;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearsOfWarranty() {
        return yearsOfWarranty;
    }

    public void setYearsOfWarranty(int yearsOfWarranty) {
        this.yearsOfWarranty = yearsOfWarranty;
    }

    public void display() {
        System.out.println("Brand: " + getBrandName());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Warranty (in years): " + getYearsOfWarranty());
    }
}
