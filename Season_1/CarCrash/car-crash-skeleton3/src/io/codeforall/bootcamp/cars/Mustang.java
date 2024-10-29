package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Mustang extends Car {
        //  Construtor que define nova posicao do carro
    public Mustang(){
        super(new Position((int) (Math.random() * Field.getHeight()), (int) (Math.random() * Field.getWidth())));

    }
    @Override  // Coloca a referencia de memória em uma Letra
    public String toString(){
        return "M";
    }
}
