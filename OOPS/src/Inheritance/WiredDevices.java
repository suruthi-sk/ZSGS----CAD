package Inheritance;

public class WiredDevices extends AudioDevices{
    private boolean isWithBuds;
    private float wireLengthInMeters;

    public WiredDevices(String brandName, String color, double price, int yearsOfWarranty, boolean isWithBuds, float wireLengthInMeters) {
        super(brandName, color, price, yearsOfWarranty);
        this.isWithBuds = isWithBuds;
        this.wireLengthInMeters = wireLengthInMeters;
    }

    public boolean isWithBuds() {
        return isWithBuds;
    }

    public void setWithBuds(boolean withBuds) {
        isWithBuds = withBuds;
    }

    public float getWireLength() {
        return wireLengthInMeters;
    }

    public void setWireLength(float wireLength) {
        wireLengthInMeters = wireLength;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Is with buds: " + (isWithBuds() ? "YES" : "NO"));
        System.out.println("Wire length: " + getWireLength());
    }
}
