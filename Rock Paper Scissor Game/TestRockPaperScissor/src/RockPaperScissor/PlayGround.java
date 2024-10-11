package RockPaperScissor;

public class PlayGround {

    public static void main(String[] args) {

        Player player1 = new Player("Pedro");
        Player player2 = new Player("João");
        Game computer = new Game();

        for (int i = 0; i < 3; i++) {
            player1.setPlayerHand(computer.randomizer());
            player2.setPlayerHand(computer.randomizer());
            computer.compareHands(player1, player2);
            System.out.println();
        }
    }
}
