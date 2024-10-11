public class MagicLamp {

    private int numberRub;
    private int maxGenie;
    private int numberRecycles;
    private int numberDemons;

    public MagicLamp(int maxGenie) {
        this.maxGenie = maxGenie;
        this.numberDemons = 0;
        this.numberRecycles = 0;
        this.numberRub = 0;
    }

    public Genie rubLamp() {
        if (numberRub < maxGenie) {
            numberRub++;
            if (numberRub % 2 == 1) {
                System.out.println("You got a Grumpy Genie");
                return new Grumpy();
            } else {
                System.out.println("You got a Friendly Genie");
                return new Friendly();
            }

        } else {
            if (numberRub < 3) {
                numberDemons++;
                System.out.println("You got a Demon");
                return new Demon();
            } else {
                System.out.println("No more genies or demons can be summoned.");
                return null;
            }
        }
    }

    public void recycle() {
        numberRub = 0;
        numberDemons--;
        numberRecycles++;
    }

}
