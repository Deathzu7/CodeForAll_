package io.codeforall.fanstatics;

public class SniperRifle {

    private int bulletDamage = 1;
    private final float HIT_PROB = 0.3f;

    public void SniperRifle(Enemy target){
        //Must have a probability of missing shots
        //Must indicate how much damage is caused by each shot
        if(Math.random() < HIT_PROB){
            target.hit(bulletDamage);
            System.out.println("It's a hit.");
        }else {
            System.out.println("Missed shot.");
        }
    }
}
