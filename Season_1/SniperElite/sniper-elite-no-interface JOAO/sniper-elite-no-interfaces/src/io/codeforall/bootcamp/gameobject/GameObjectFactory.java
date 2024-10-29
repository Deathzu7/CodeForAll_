package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.Destroyable;
import io.codeforall.bootcamp.gameobject.enemy.ArmouredEnemy;
import io.codeforall.bootcamp.gameobject.enemy.Enemy;
import io.codeforall.bootcamp.gameobject.enemy.SoldierEnemy;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;


    public static GameObject createDestroyables() {
        int number = (int) Math.floor(Math.random() * 3);

       if (number == 0){
            return new SoldierEnemy(ENEMY_HEALTH);
        }

       if (number == 1){
            return new ArmouredEnemy(ENEMY_HEALTH,ARMOUR);
        }

        if (number == 2){
            return new Barrel();
        }
        return null;
        }





    }
