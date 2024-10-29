public class Game {
   private int number;

    public Game(int number){
        this.number=number;
    }

    public int getNumber(){
        return number;
    }


    public void CompareNumbers(int PlayerNumber){  // Metodo comparção
        if(number == PlayerNumber){
            System.out.println("Player guessed correctly.Game Ends!"+number+" "+PlayerNumber);

        }
        else{

            System.out.println("Wrong number. Guess again!"+number+" "+PlayerNumber);

        }
    }
}