public class Playground {
    public static void main(String[] args) {


        MagicLamp magicLamp1 = new MagicLamp(2);


        Genie genie = magicLamp1.rubLamp();
        genie.makeAWish();
        genie.makeAWish();
        System.out.println("-------");

        Genie genie2 = magicLamp1.rubLamp();
        genie2.makeAWish();
        System.out.println("-------");

        Genie genie3 = magicLamp1.rubLamp();
        genie3.makeAWish();
        System.out.println("------");
        magicLamp1.recycle();
        System.out.println("-----");
        Genie genie4 = magicLamp1.rubLamp();
        genie4.makeAWish();
    }
}
