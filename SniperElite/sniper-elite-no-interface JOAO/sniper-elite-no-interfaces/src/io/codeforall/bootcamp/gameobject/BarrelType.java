package io.codeforall.bootcamp.gameobject;

public enum BarrelType {

    PLASTIC(2),
    WOOD(3),
    METAL(4);

    BarrelType(int maxHealth){
        this.maxHealth = maxHealth;

    }

    private int maxHealth;

    public int getMaxHealth() {
        return maxHealth;
    }
}
