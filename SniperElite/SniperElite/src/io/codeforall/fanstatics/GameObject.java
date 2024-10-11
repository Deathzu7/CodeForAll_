package io.codeforall.fanstatics;

public abstract class GameObject {
    public static GameObject getNewObject(){
        int random = (int) (Math.random() * ObjectType.values().length);
        ObjectType objectType = ObjectType.values()[random];

        GameObject object = null;

        switch(objectType){
            case TREE:
                if(random < 3){
                object = new Tree();
                break;}
            case ARMOURED_ENEMY:
                if(random <= 5){
                object = new ArmouredEnemy();
                break;}
            case SOLDIER_ENEMY:
                if(random < 10)
                object = new SoldierEnemy();
        }
        return object;
    }

    public void getMessage(){

    }
}
