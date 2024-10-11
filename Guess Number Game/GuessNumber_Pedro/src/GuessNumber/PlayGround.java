package GuessNumber;

public class PlayGround {
    public static void main(String[] args) {

        Game game = new Game(Generator.Generator());
        Player Pedro = new Player("Pedro", Generator.Generator());

        while (game.getNumber() != Pedro.getNumber()) {
            game.comparision(Pedro.getNumber());
            Pedro.setNumber((Generator.Generator()));
            if (game.getNumber() == Pedro.getNumber()) {
                game.comparision(Pedro.getNumber());

            }
        }
    }
}
