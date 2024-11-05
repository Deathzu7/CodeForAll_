package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class SneakAttack extends AbstractAbility{

    public SneakAttack(int manaCost, int cooldown, Hero hero) {
        super(manaCost, cooldown, hero);
    }

    @Override
    public void useAbility() {
        if (canUseAbility()) {
            int damage = (int) (hero.getDamage() * 1.5); // Critical hit logic
            System.out.println(hero.getName() + " uses Sneak Attack, dealing " + damage + " critical damage!");
            hero.reduceMana(manaCost);
            resetCooldown();
        }
    }

}
