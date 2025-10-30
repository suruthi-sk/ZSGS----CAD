package Inheritance;

public class WirelessDevices extends AudioDevices{
    private int chargingHours;
    private int bandWidth;

    public WirelessDevices(String brandName, String color, double price, int yearsOfWarranty, int chargingHours, int bandWidth) {
        super(brandName, color, price, yearsOfWarranty);
        this.chargingHours = chargingHours;
        this.bandWidth = bandWidth;
    }

    public int getChargingHours() {
        return chargingHours;
    }

    public void setChargingHours(int chargingHours) {
        this.chargingHours = chargingHours;
    }

    public int getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(int bandWidth) {
        this.bandWidth = bandWidth;
    }

    public void display() {
        super.display();;
        System.out.println("Charging hours: " + getChargingHours());
        System.out.println("BandWidth: "  + getBandWidth());
    }
}
