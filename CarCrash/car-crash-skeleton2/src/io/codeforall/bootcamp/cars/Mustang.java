package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Mustang extends Car{

    public Mustang(){
        super(new Position((int) (Math.random() * Field.getWidth()), (int) (Math.random() * Field.getHeight())));

    }

    @Override
    public String toString(){
        return "M";
    }
}
