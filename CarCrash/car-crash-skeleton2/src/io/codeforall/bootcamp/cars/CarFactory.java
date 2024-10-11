package io.codeforall.bootcamp.cars;

public class CarFactory {
// Classe CarFactory responsável pela criação de carros

    // Metodo que cria e retorna um novo carro (Fiat ou Mustang aleatoriamente)

    public static  Car getNewCar() {
        int newCar = (int) (Math.random()*2);
                if (newCar == 0){
                    return new Fiat(); // Retorna um novo carro tipo Fiat
                }
                else {
                    return new Mustang();
                }

    }
}
