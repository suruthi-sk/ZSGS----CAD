package custominterface;

public class SpiderMan implements SuperPowers{
    public void canFly() {
        System.out.println("Spiderman can fly but not naturally...!");
    }

    public void canMakeFire() {
        System.out.println("Spiderman cannot make fire");
    }

    @Override
    public void Strength() {
        System.out.println("Strength rate (out of 100) : 80");
    }

    @Override
    public void brainPower() {
        System.out.println("Brain power rate (out of 10): 8.7");
    }

    @Override
    public void Speciality() {
        System.out.println("Special power of spiderman is 'Spider-Sens'");
    }

    public void allPowers() {
        System.out.println("Spiderman.........");
        canFly();
        canMakeFire();
        Strength();
        brainPower();
        Speciality();
        System.out.println();
    }
}
