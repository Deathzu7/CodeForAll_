package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public abstract class AbstractAbility implements Ability {

    protected int cooldown;
    protected int currentCooldown;
    protected int manaCost;
    protected Hero hero;

    public AbstractAbility(int manaCost, int cooldown, Hero hero) {
        this.manaCost = manaCost;
        this.cooldown = cooldown;
        this.currentCooldown = 0;
        this.hero = hero;
    }

    @Override
    public boolean canUseAbility() {
        return currentCooldown <= 0 && hero.getMana() >= manaCost && hero.getHealth() > 0;
    }


    public void reduceCooldown() {
        if (currentCooldown > 0) currentCooldown--;
    }

    protected void resetCooldown() {
        currentCooldown = cooldown;
    }

    @Override
    public int getManaCost() {
        return manaCost;
    }

}
