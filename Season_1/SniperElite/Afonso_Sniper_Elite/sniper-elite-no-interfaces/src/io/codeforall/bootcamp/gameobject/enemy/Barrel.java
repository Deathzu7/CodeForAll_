package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.GameObject;

public class Barrel extends GameObject implements Destroyable{

private BarrelType barrelType;
private int currentDamage;
private boolean destroyed;

public Barrel(BarrelType barrelType){
    this.barrelType= barrelType;
    destroyed = false;
    BarrelType.METAL.setMaxDamage(8);
    BarrelType.PLASTIC.setMaxDamage(3);
    BarrelType.WOOD.setMaxDamage(5);
}


public void hit(int currentDamage){
   barrelType.setMaxDamage(barrelType.getMaxDamage() - currentDamage);

}
public boolean isDestroyed(){
    return destroyed = true;


}
public String getMessage(){
   return "Taking " + barrelType +"  down";
}




}
