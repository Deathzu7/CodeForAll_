package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.Hero;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TurnManager {
    private int currentTurn;
    private Random random;

    public TurnManager() {
        this.currentTurn = 1;
        this.random = new Random();
    }

    public void executeTurn(List<Hero> heroes) {
        System.out.println("Turn " + currentTurn + " begins!");
        Collections.shuffle(heroes);
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) { // Verifica se o herói está vivo antes de agir
                Hero target = selectRandomTarget(heroes, hero);
                if (target != null && target.getHealth() > 0) { // Verifica se o alvo está vivo
                    hero.takeTurn(target);
                }
            }
        }
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && hero.ability != null) {
                hero.ability.reduceCooldown();
            }
        }
        currentTurn++;
        System.out.println("Turn " + currentTurn + " ends.\n");
    }

    private Hero selectRandomTarget(List<Hero> heroes, Hero currentHero) {
        List<Hero> potentialTargets = heroes.stream()
                .filter(hero -> hero != currentHero && hero.getHealth() > 0)
                .toList();
        if (potentialTargets.isEmpty()) {
            return null;
        }
        return potentialTargets.get(random.nextInt(potentialTargets.size()));
    }

}