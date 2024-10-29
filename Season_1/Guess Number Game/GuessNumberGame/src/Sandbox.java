public class Sandbox {

    public static void main(String[] args) {

        Game game = new Game(Generator.getRandomNumber());         //Criar objecto game com o parametro do random number
        //Player Gustavo = new Player("Gustavo", Generator.getRandomNumber()); //Criar player com parametro nome e parametro randonumber

        Player[] Players ={new Player("João", Generator.getRandomNumber()),new Player("José",Generator.getRandomNumber()),new Player("Rafa",Generator.getRandomNumber())};


        while(true) {
            for (int i = 0; i < Players.length; i++) {        // Percorrer o arra// y
                if (Players[i].getNumber() == game.getNumber()) {
                    System.out.println("Player" + i + " guessed the number");   // Didnt guessed
                    return;
                } else {
                    System.out.println("Player" + i + " try again");
                    Players[i].setNumber(Generator.getRandomNumber());      // Generate new number for player
                }
            }
        }
        // para o codigo abaixo funcionar , comentar desde a linha 7 á 21 inclusive. e Descomentar a linha 6
       /* while (game.getNumber() != Gustavo.getNumber()) {   //  enquanto player for diferente de game number
            game.CompareNumbers(Gustavo.getNumber());      //O game esta a dar mensagem de errou e o get é para o game ler o numero do player
            Gustavo.setNumber(Generator.getRandomNumber());   // Numero do Gustavo esta privado entao usa se SET para gerar novo numero
            if (game.getNumber() == Gustavo.getNumber()) {
                game.CompareNumbers(Gustavo.getNumber());      //o game esta a dar mensagem de acertou e o GET e para o game ler o numero do player
            }

        }*/
    }
}