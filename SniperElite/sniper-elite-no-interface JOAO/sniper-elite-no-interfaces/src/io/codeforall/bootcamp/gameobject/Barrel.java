package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.Destroyable;


public  class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;


    private int health;

    private boolean destroyed;


    public Barrel(){
        this.barrelType = barrelTypeGenerator();
        this.health = barrelType.getMaxHealth();
    }



    public BarrelType barrelTypeGenerator(){
        int number= (int) Math.floor(Math.random()*3);
        switch (number){
            case 0:
               BarrelType plastic = BarrelType.PLASTIC;
               return plastic;
            case 1:
                BarrelType wood = BarrelType.WOOD;
                return wood;

            default:
                BarrelType metal = BarrelType.METAL;
                return metal;
        }

    }


    @Override
    public boolean isDestroyed() {
        return health <= 0;
    }

    @Override
    public void hit(int damage) {
        health = health - damage > 0 ? health - damage : 0;

    }

    @Override
    public String getMessage() {
        return "Barrel appeard! We gonna shoot it!";
    }
}


