package custominterface;

public class BatMan implements SuperPowers{
    public void canFly() {
        System.out.println("Batman can fly...!");
    }

    public void canMakeFire() {
        System.out.println("Batman cannot make fire");
    }

    @Override
    public void Strength() {
        System.out.println("Strength rate (out of 100) : 85");
    }

    @Override
    public void brainPower() {
        System.out.println("Brain power rate (out of 10): 9");
    }

    @Override
    public void Speciality() {
        System.out.println("Special power of batman is 'his choice to become a hero despite having no inherent powers, relying solely on intellect, will, and resources to protect Gotham'");
    }

    public void allPowers() {
        System.out.println("Batman.....");
        canFly();
        canMakeFire();
        Strength();
        brainPower();
        Speciality();
        System.out.println();
    }
}
