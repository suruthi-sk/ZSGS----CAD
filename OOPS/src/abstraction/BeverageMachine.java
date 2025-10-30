package abstraction;

abstract public class BeverageMachine {

    private int sugarLevelInPercent;
    private boolean addMilk;
    private int waterLevelInPercent;


    public BeverageMachine(int sugarLevelInPercent, boolean addMilk, int waterLevelInPercent) {

        this.sugarLevelInPercent = sugarLevelInPercent;
        this.addMilk = addMilk;
        this.waterLevelInPercent = waterLevelInPercent;
    }

    public int getSugarLevelInPercent() {
        return sugarLevelInPercent;
    }

    public void setSugarLevelInPercent(int sugarLevelInPercent) {
        this.sugarLevelInPercent = sugarLevelInPercent;
    }

    public boolean isAddMilk() {
        return addMilk;
    }

    public void setAddMilk(boolean addMilk) {
        this.addMilk = addMilk;
    }

    public int getWaterLevelInPercent() {
        return waterLevelInPercent;
    }

    public void setWaterLevelInPercent(int waterLevelInPercent) {
        this.waterLevelInPercent = waterLevelInPercent;
    }

    abstract public void prepareDrink();

    public void display() {
        System.out.println("Sugar Level: " + getSugarLevelInPercent() + "%");
        System.out.println("Water level: " + getWaterLevelInPercent() + "%");
        System.out.println("Milk Added: " + ((isAddMilk()) ? "YES" : "NO"));
    }
}
