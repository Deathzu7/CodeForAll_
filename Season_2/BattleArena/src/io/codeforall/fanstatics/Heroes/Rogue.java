package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.SneakAttack;

public class Rogue extends Hero {

    public Rogue(String name, int health, int mana, int damage, int defense) {
        super(name, health, mana, damage, defense);
        this.ability = new SneakAttack(30, 2, this); // Example values
    }

    @Override
    public void performAction() {
        // Rogue-specific behavior
    }
}
