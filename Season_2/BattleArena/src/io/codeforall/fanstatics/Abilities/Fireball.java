package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class Fireball extends AbstractAbility {

    public Fireball(int manaCost, int cooldown, Hero hero) {
        super(manaCost, cooldown, hero);
    }
    @Override
    public void useAbility() {
        if (canUseAbility()) {
            int damage = hero.getDamage() * 2; // Double the hero's base damage
            // Logic to apply damage to the target hero
            System.out.println(hero.getName() + " uses Fireball, dealing " + damage + " damage!");
            hero.reduceMana(manaCost);
            resetCooldown();
        }
    }
}