package io.codeforall.fanstatics;

public abstract class Enemy extends GameObject{
    int health;

    boolean isDead;

    public boolean isDead(){
        return true;
    }

    public Enemy(){
        this.health = 100;
        this.isDead = false;
    }

    public void hit(int hit){

    }

    public void getMessage (){
        System.out.println("I've been hit!");
    }
}
