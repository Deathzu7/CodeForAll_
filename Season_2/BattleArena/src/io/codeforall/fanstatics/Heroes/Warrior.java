package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.ShieldBlock;

public class Warrior extends Hero {
    public Warrior(String name, int health, int mana, int damage, int defense) {
        super(name, health, mana, damage, defense);
        this.ability = new ShieldBlock(20, 4, this); // Example values
    }
    @Override
    public void performAction() {
        // Warrior-specific behavior
    }
}
