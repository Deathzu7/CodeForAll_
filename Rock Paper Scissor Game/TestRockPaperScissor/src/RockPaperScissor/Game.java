package RockPaperScissor;

public class Game {

    public static Hand randomizer() {
        int choice = (int) Math.floor(Math.random() * 3);

        switch (choice) {

            case 0:
                return Hand.ROCK;

            case 1:
                return Hand.PAPER;              // isto é o randomizer

            default:
                return Hand.SCISSOR;
        }

    }
    public void compareHands(Player player1, Player player2) {
        Hand hand1 = player1.getPlayerHand();
        Hand hand2 = player2.getPlayerHand();

        System.out.println(player1.getName() + " throws " + hand1);
        System.out.println(player2.getName() + " throws " + hand2);

        if (hand1 == hand2) {
            System.out.println("It's a draw!");
        } else if ((hand1 == Hand.ROCK && hand2 == Hand.SCISSOR) ||
                (hand1 == Hand.PAPER && hand2 == Hand.ROCK) ||
                (hand1 == Hand.SCISSOR && hand2 == Hand.PAPER)) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }

    }

}
