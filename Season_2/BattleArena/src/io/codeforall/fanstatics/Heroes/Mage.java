package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Fireball;

public class Mage extends Hero {
    public Mage(String name, int health, int mana, int damage, int defense) {
        super(name, health, mana, damage, defense);
        this.ability = new Fireball(40, 3, this); // Example values
    }
    @Override
    public void performAction() {
        // Mage-specific behavior
    }
}
