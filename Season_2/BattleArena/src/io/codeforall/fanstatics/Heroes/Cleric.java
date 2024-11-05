package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Heal;

public class Cleric extends Hero {

    public Cleric(String name, int health, int mana, int damage, int defense) {
        super(name, health, mana, damage, defense);
        this.ability = new Heal(35, 3, this); // Example values
    }
    @Override
    public void performAction() {
        // Cleric-specific behavior
    }
}
