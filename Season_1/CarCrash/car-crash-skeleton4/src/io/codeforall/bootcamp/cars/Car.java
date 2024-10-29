package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean crashed;

    public Car(Position pos) {
        this.crashed = false;
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public void moveCar() {
        int moveCar = (int) (Math.random() * 4);

        switch (moveCar) {
            case 0:
                if (pos.getRow() < Field.getHeight() - 1) {
                    pos.setRow(pos.getRow() + 1);
                }
                break;
            case 1:
                if (pos.getRow() > 0) {
                    pos.setRow(pos.getRow() - 1);
                }
                break;
            case 2:
                if (pos.getCol() < Field.getWidth() - 1) {
                    pos.setCol(pos.getCol() + 1);
                }
                break;
            case 3:
                if (pos.getCol() > 0) {
                    pos.setCol(pos.getCol() - 1);
                }
                break;
        }

        }
        @Override
        public String toString(){
            return  super.toString();
    }
}
