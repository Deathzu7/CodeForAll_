package GuessNumber;

import java.util.random.RandomGenerator;

public class Player {

    private int number;
    private String name;

    public Player(String name, int getRandomGenerator) {
        this.number = getRandomGenerator;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}