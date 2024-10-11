package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.createObjects();
        //game.start();

        System.out.println(GameObject.getNewObject());

    }
}
