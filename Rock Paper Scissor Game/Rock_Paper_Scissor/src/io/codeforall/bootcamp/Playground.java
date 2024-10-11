package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {

        Player player1 = new Player("Pedro");
        player1.getPlayerName();

        Game gamePc = new Game("computer", player1);
        gamePc.getComputerName();
        gamePc.getPlayerName();

        // NEW
        System.out.println("gamepc: " + gamePc.getComputerName() + " player1: " + gamePc.getPlayerName() );





        //HandType rock = HandType.ROCK;
        //System.out.println(player1.getPlayerName() + " got: " + rock.getHandSelected());





    }
}
