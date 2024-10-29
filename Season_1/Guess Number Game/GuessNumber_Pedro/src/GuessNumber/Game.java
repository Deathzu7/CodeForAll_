package GuessNumber;

public class Game {

    private int number;

    public Game(int number) {
        this.number = number;
        System.out.println("Game number: " + number);
    }

    public int getNumber(){
        return number;
    }

    public void comparision(int playerNumber) {
        if (number != playerNumber){
            System.out.println("wrong number, Player got: " + playerNumber);
        }
        else {
            System.out.println("Player got the number, he wins: " + playerNumber);
        }
    }
}
