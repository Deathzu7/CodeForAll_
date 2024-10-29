package io.codeforall.bootcamp.cars;

public class CarFactory {

    // Metodo que cria e retorna um novo carro
    public static Car getNewCar() {
        int newCar = (int) ((Math.floor(Math.random() * 2)));
        if (newCar == 0) {
            return new Fiat();
        } else {
            return new Mustang();
        }

    }
}
