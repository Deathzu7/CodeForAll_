package io.codeforall.fanstatics;

public class Game {

    public static final int MAXIMUM_ENEMIES = 10;
    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;

    private int shotsFired;

    ObjectType tree = ObjectType.TREE;

    public void start() {
        //It must be always shooting at enemies
        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Tree){

            }verify if its enemey or tree)
            if enemy = shoot
            Enemy.getMessage();
                verify if its armoured or simple:
            System.out.println("Remaining armour: " + armour);
            System.out.println("Remaining health: " + health);
        } Tree.getMessage
    }

    public void createObjects(){
        gameObjects = new GameObject[MAXIMUM_ENEMIES];

        for (int i = 0; i < gameObjects.length; i++){
            gameObjects[i] = GameObject.getNewObject();
        }
    }
}
