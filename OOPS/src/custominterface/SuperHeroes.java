package custominterface;

public class SuperHeroes {
    public static void main(String[] args) {
        SuperPowers superman = new SuperMan();
        SuperPowers ironman = new IronMan();
        SuperPowers batman = new BatMan();
        SuperPowers spiderman = new SpiderMan();

        superman.allPowers();
        batman.allPowers();
        ironman.allPowers();
        spiderman.allPowers();
    }
}
