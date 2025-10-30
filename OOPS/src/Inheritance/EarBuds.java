package Inheritance;

public class EarBuds extends WirelessDevices{
    private boolean isWithENC;

    public EarBuds(String brandName, String color, double price, int yearsOfWarranty, int chargingHours, int bandWidth, boolean isWithENC) {
        super(brandName, color, price, yearsOfWarranty, chargingHours, bandWidth);
        this.isWithENC = isWithENC;
    }

    public boolean isWithENC() {
        return isWithENC;
    }

    public void setWithENC(boolean withENC) {
        isWithENC = withENC;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Is with ENC? "  + (isWithENC ? "YES" : "NO"));
    }
}
