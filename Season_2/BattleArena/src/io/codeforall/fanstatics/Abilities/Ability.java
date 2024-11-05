package io.codeforall.fanstatics.Abilities;

public interface Ability {

    void useAbility();
    boolean canUseAbility();
    void reduceCooldown();
    int getManaCost();
}


