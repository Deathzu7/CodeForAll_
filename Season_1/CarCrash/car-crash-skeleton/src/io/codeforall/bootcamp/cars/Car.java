package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed;

    public Car(Position pos) {
        this.pos = pos;
        this.crashed = false;
    }

    public boolean isCrashed() {
        return !crashed;
    }

    public void crash() {
        crashed = true;
    }


    public Position getPos() {
        return pos;
    }




    public abstract String toString();
}

