public class Generator {

    public static int getRandomNumber() {
        int x = (int)Math.floor(Math.random()*11); // (int) serve para force int
        return x;
    }
}