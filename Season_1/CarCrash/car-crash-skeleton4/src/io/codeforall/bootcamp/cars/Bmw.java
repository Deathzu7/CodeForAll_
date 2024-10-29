package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Bmw extends Car {

    public Bmw() {
        super(new Position((int) (Math.random() * Field.getHeight()), (int) (Math.random() * Field.getWidth())));
    }

    @Override
    public String toString(){
        return "Bmw";
    }
}
