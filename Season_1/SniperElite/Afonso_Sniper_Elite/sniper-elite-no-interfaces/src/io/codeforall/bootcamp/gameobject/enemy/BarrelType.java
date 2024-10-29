package io.codeforall.bootcamp.gameobject.enemy;

public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;

    private int maxDamage;


    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
}
