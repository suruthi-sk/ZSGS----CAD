package custominterface;

public class IronMan implements SuperPowers{
    public void canFly() {
        System.out.println("Ironman can fly...!");
    }

    public void canMakeFire() {
        System.out.println("Ironman can make fire");
    }

    @Override
    public void Strength() {
        System.out.println("Strength rate (out of 100) : 86");
    }

    @Override
    public void brainPower() {
        System.out.println("Brain power rate (out of 10): 8.3");
    }

    @Override
    public void Speciality() {
        System.out.println("Special power of ironman is 'super-hearing, which allows him to hear conversations and sounds from great distances, even while flying away from a scene'.");
    }

    public void allPowers() {
        System.out.println("Ironman........");
        canFly();
        canMakeFire();
        Strength();
        brainPower();
        Speciality();
        System.out.println();
    }
}
