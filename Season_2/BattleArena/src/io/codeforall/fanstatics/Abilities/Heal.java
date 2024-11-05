package io.codeforall.fanstatics.Abilities;


import io.codeforall.fanstatics.Heroes.Hero;

public class Heal extends AbstractAbility{

    public Heal(int manaCost, int cooldown, Hero hero) {
        super(manaCost, cooldown, hero);
    }
    @Override
    public void useAbility() {
        if (canUseAbility()) {
            int healAmount = hero.getHealth() + 30; // Healing logic
            System.out.println(hero.getName() + " uses Heal, restoring health!");
            hero.setHealth(healAmount);
            hero.reduceMana(manaCost);
            resetCooldown();
        }
    }

}
