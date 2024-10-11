public class Playground {
    public static void main(String[] args) {

        Game game = new Game(Generator.Generator());
        Player player1 = new Player(Generator.Generator());

        while (game.getNumber() != player1.getNumber()) {
            game.comparision(player1.getNumber());
            player1.setNumber(Generator.Generator());
            if (game.getNumber() == player1.getNumber()) {
                game.comparision(player1.getNumber());
            }
        }
    }
}
