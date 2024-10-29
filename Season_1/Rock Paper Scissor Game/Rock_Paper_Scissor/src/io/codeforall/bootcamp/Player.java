package io.codeforall.bootcamp;

public class Player {


private String playerName;


public Player (String playerName){
    this.playerName = playerName;
}

    public String getPlayerName() {
        return playerName;
    }




    public static void randomizer(){
        int randomizerPlayer= (int) Math.floor(Math.random()*3);

    }



}