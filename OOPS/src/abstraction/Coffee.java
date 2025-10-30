package abstraction;

public class Coffee extends BeverageMachine{
    private boolean isFilterCoffee;
    private int decoctionAmount;

    public Coffee(int sugarLevelInPercent, boolean addMilk, int waterLevelInPercent, boolean isFilterCoffee, int decoctionAmount) {
        super(sugarLevelInPercent, addMilk, waterLevelInPercent);
        this.isFilterCoffee = isFilterCoffee;
        this.decoctionAmount = decoctionAmount;
    }

    public boolean isFilterCoffee() {
        return isFilterCoffee;
    }

    public void setFilterCoffee(boolean filterCoffee) {
        isFilterCoffee = filterCoffee;
    }

    public int getDecoctionAmount() {
        return decoctionAmount;
    }

    public void setDecoctionAmount(int decoctionAmount) {
        this.decoctionAmount = decoctionAmount;
    }

    public void prepareDrink() {
        System.out.println("===============================");
        System.out.println("|| Steps in Preparing Coffee ||");
        System.out.println("===============================");

        System.out.println("1. Boil milk until it boil and starts overflowing.");
        System.out.println("2. Add required amount of coffee decoction.");
        if(isFilterCoffee()) {
            System.out.println("2.5. Enable filter coffee mode.");
        }
        System.out.println("3. Make it boils well and gives a pleasant odor of coffee.");
        System.out.println("4. Mix sugar as required amount and mix well");
        System.out.println("....Your coffee is ready....");
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("Ingredients: ");
        super.display();
        System.out.println("Decoction level: " + getDecoctionAmount() + "%");
        System.out.println("Filter Coffee: "  + (isFilterCoffee() ? "YES" : "NO"));
        System.out.println();
    }
}
