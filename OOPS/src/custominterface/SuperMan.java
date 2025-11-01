package custominterface;

public class SuperMan implements SuperPowers{
    public void canFly() {
        System.out.println("Superman can fly...!");
    }

    public void canMakeFire() {
        System.out.println("Superman cannot make fire");
    }

    @Override
    public void Strength() {
        System.out.println("Strength rate (out of 100) : 60");
    }

    @Override
    public void brainPower() {
        System.out.println("Brain power rate (out of 10): 8");
    }

    @Override
    public void Speciality() {
        System.out.println("Special power of superman is 'unwavering moral character and boundless hope'");
    }

    public void allPowers() {
        System.out.println("Superman........");
        canFly();
        canMakeFire();
        Strength();
        brainPower();
        Speciality();
        System.out.println();
    }
}
