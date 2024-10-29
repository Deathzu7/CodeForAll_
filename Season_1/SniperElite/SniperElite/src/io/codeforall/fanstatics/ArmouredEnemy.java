package io.codeforall.fanstatics;

public class ArmouredEnemy extends Enemy{

    int armour;

    public ArmouredEnemy(){
        this.armour = 50;
    }
    public void hit(int hit){
        //Loses ALL armour before losing health
    }
}
