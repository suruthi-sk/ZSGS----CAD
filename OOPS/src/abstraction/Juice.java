package abstraction;

public class Juice extends BeverageMachine{
    private int iceLevelInPercent;

    public Juice(int sugarLevelInPercent, boolean addMilk, int waterLevelInPercent, int iceLevelInPercent) {
        super(sugarLevelInPercent, addMilk, waterLevelInPercent);
        this.iceLevelInPercent = iceLevelInPercent;
    }

    public int getIceLevelInPercent() {
        return iceLevelInPercent;
    }

    public void setIceLevelInPercent(int iceLevelInPercent) {
        this.iceLevelInPercent = iceLevelInPercent;
    }

    public void prepareDrink() {
        System.out.println("==============================");
        System.out.println("|| Steps in Preparing Juice ||");
        System.out.println("==============================");

        System.out.println("""
                1. Put the peeled or cut fruit inside the respective container
                2. Mention sugar level
                3. Mention water level
                4. Mention ice level
                5. Press start juicing button
                6. Stop when ot indicates ready
                Your Juice is ready to drink!!
                
                """);
    }

    @Override
    public void display() {
        System.out.println("Ingredients of Juice: ");
        super.display();
        System.out.println("Ice level: " + getIceLevelInPercent() + "%");
        System.out.println();
    }
}
