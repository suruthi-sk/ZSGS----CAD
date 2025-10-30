package Inheritance;

public class Main {
    public static void main(String[] args) {
        AudioDevices cTypeHeadphone = new CTypePlug("Sony", "White", 650, 4, true, 15);
        AudioDevices miniJackType = new MiniJackPlug("Samsung", "Black", 150, 2, false, 20);
        AudioDevices buds = new EarBuds("Noise", "Lavender", 1299, 2, 1, 80, true);
        AudioDevices neckBand = new NeckBand("One plus", "Red with black", 799, 3, 2,  120);

        System.out.println();
        new Main().print(cTypeHeadphone, miniJackType, buds, neckBand);

        // Changing price for mini-jack
        miniJackType.setPrice(250);

        // changing buds years of warranty
        buds.setYearsOfWarranty(7);

        // changing c type brand
        cTypeHeadphone.setBrandName("Realme");

        // changing neck band color
        neckBand.setColor("Blue");

        System.out.println();
        System.out.println("================");
        System.out.println("||After change||");
        System.out.println("================");
        System.out.println();

        new Main().print(cTypeHeadphone, miniJackType, buds, neckBand);

    }

    private void print(AudioDevices cTypeHeadphone, AudioDevices miniJackType, AudioDevices buds, AudioDevices neckBand) {
        System.out.println("Some information");
        System.out.println("================");
        System.out.println();

        System.out.println("C Type plug headphones details");
        System.out.println("==============================");
        cTypeHeadphone.display();
        System.out.println();

        System.out.println("Mini-jack Type plug headphones details");
        System.out.println("=======================================");
        miniJackType.display();
        System.out.println();

        System.out.println("Earbuds details");
        System.out.println("================");
        buds.display();
        System.out.println();

        System.out.println("Neckband details");
        System.out.println("================");
        neckBand.display();
        System.out.println();
    }
}
