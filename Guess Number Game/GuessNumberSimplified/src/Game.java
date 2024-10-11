public class Game {
    public int number=Generator.RandomNumber();

    public void Comparison(int PlayerNumber){
        if(number !=PlayerNumber){
            System.out.println(number+" "+PlayerNumber +" Try again");
        }
        else{
            System.out.println(number+PlayerNumber +" Match");
        }

    }


}
