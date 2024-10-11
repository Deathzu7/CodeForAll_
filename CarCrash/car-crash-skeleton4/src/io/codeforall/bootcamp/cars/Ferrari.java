package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Ferrari extends Car {

    public Ferrari() {
        super(new Position((int) (Math.random() * Field.getWidth()), (int) (Math.random() * Field.getHeight())));
    }

    @Override
    public String toString(){
        return "F40";
    }
}
