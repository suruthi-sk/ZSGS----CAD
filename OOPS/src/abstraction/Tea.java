package abstraction;

public class Tea extends BeverageMachine{
    private int decoctionLevelInPercent;
    private boolean isSpicesTea;

    public Tea(int sugarLevelInPercent, boolean addMilk, int waterLevelInPercent, int decoctionLevelInPercent, boolean isSpicesTea) {
        super(sugarLevelInPercent, addMilk, waterLevelInPercent);
        this.decoctionLevelInPercent = decoctionLevelInPercent;
        this.isSpicesTea = isSpicesTea;
    }

    public int getDecoctionLevelInPercent() {
        return decoctionLevelInPercent;
    }

    public void setDecoctionLevelInPercent(int decoctionLevelInPercent) {
        this.decoctionLevelInPercent = decoctionLevelInPercent;
    }

    public boolean isSpicesTea() {
        return isSpicesTea;
    }

    public void setSpicesTea(boolean spicesTea) {
        isSpicesTea = spicesTea;
    }

    public void prepareDrink() {
        System.out.println("============================");
        System.out.println("|| Steps in Preparing Tea ||");
        System.out.println("============================");

        System.out.println("1. Boil milk until it boil and starts overflowing.");
        System.out.println("2. Add required amount of decoction.");
        if(isSpicesTea()) {
            System.out.println("2.5. Add spices.");
        }
        System.out.println("3. Make it boils well and gives a pleasant odor of tea.");
        System.out.println("4. Mix sugar as required amount and mix well");
        System.out.println("....Your tea is ready....");
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("Ingredients: ");
        super.display();
        System.out.println("Decoction level: "  +getDecoctionLevelInPercent() + "%");
        System.out.println("Is spices Added: " +  ((isSpicesTea())  ? "YES" : "NO"));
        System.out.println();
    }
}
