package io.codeforall.bootcamp.cars;

public class CarFactory {

    public static Car getNewCar() {
        int car = (int) (Math.random() * 2);
        if (car == 0) {
            return new Bmw();
        } else {
            return new Ferrari();

        }
    }
}