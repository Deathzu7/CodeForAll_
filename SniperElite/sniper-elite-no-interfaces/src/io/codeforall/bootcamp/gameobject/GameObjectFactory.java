package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.gameobject.enemy.*;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;

    public static Enemy createEnemy() {

        return Math.random() > 0.6 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);

    }

    public static Barrel createBarrel() {
        int random = (int) (Math.random() * BarrelType.values().length);
        BarrelType barrelType = BarrelType.values()[random];


        switch (barrelType) {
            case PLASTIC:
                return new Barrel(BarrelType.PLASTIC);

            case WOOD:
                return new Barrel(BarrelType.WOOD);

            case METAL:
                return new Barrel(BarrelType.METAL);

        }
        return new Barrel(BarrelType.METAL);
    }
}