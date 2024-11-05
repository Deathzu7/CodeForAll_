package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.*;

public class Main {
    public static void main(String[] args) {

        Arena arena = new Arena();
        Hero warrior = new Warrior("Warrior", 150, 50, 20, 5);
        Hero mage = new Mage("Mage", 80, 150, 35, 5);
        Hero cleric = new Cleric("Cleric", 100, 120, 15, 5);
        Hero rogue = new Rogue("Rogue", 90, 60, 25, 5);
        arena.addHero(warrior);
        arena.addHero(mage);
        arena.addHero(cleric);
        arena.addHero(rogue);
        arena.startBattle();
    }


    }

