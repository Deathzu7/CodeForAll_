package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class ShieldBlock extends AbstractAbility {
    public ShieldBlock(int manaCost, int cooldown, Hero hero) {
        super(manaCost, cooldown, hero);
    }
    @Override
    public void useAbility() {
        if (canUseAbility()) {
            System.out.println(hero.getName() + " uses Shield Block, increasing defense!");
            // Increase defense logic
            hero.reduceMana(manaCost);
            resetCooldown();
        }
    }
}