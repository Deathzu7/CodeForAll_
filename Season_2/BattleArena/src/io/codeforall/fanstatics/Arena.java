package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.Hero;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private List<Hero> heroes;
    private TurnManager turnManager;

    public Arena() {
        heroes = new ArrayList<>();
        turnManager = new TurnManager();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public void startBattle() {
        System.out.println("The battle begins!");
        while (!isGameOver()) {
            turnManager.executeTurn(heroes);
        }
        Hero winner = getWinner();
        if (winner != null) {
            System.out.println(winner.getName() + " is the winner!");
        } else {
            System.out.println("It's a draw! No heroes are left standing.");
        }
    }

    private boolean isGameOver() {
        int aliveCount = 0;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                aliveCount++;
            }
        }
        return aliveCount <= 1;
    }

    private Hero getWinner() {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                return hero;
            }
        }
        return null;
    }
}
