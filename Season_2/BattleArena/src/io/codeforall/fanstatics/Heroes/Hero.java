package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Ability;

public abstract class Hero {

    private String name;
    private int health;
    private int mana;
    private int damage;
    private int defense;
    public Ability ability;

    public Hero(String name, int health, int mana, int damage, int defense) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.defense = defense;
    }
// Getters and Setters
        public String getName () {
            return name;
        }
        public int getHealth () {
            return health;
        }
        public void setHealth ( int health){
            this.health = Math.max(health, 0);
        }
        public int getMana () {
            return mana;
        }
        public void reduceMana ( int amount){
            this.mana = Math.max(mana - amount, 0);
        }
        public int getDamage () {
            return damage;
        }
        public void takeDamage ( int damageAmount){
            int effectiveDamage = Math.max(damageAmount - defense, 1); // Garante que o dano mínimo seja 1
            setHealth(health - effectiveDamage);
            System.out.println(name + " takes " + effectiveDamage + " damage. Remaining health: " + health);
        }
        public void takeTurn (Hero target){
            if (ability != null && ability.canUseAbility()) {
                ability.useAbility();
            } else {
                performNormalAttack(target);
            }
        }
        private void performNormalAttack (Hero target){
            System.out.println(name + " performs a normal attack, dealing " + damage + " damage to " + target.getName() + "!");
            target.takeDamage(damage);
        }
        public abstract void performAction ();
    }


