package io.codeforall.bootcamp.cars;

public class CarFactory {


    public static Car getNewCar() {
        int newCar = (int) (Math.random() * 2);
        if (newCar == 0) {
            return new Fiat();
        } else {
            return new Mustang();
        }


    }

}