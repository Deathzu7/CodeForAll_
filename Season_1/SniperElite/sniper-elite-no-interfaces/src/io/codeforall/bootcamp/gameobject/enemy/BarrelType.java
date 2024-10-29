package io.codeforall.bootcamp.gameobject.enemy;

public enum BarrelType {

    PLASTIC(2),
    WOOD(3),
    METAL(4);

    private int maxDamage;

    BarrelType(int maxDamage){
        this.maxDamage = maxDamage;
    }
    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
}
