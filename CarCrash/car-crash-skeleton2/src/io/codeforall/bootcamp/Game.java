package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.cars.Fiat;
import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Game {
    // Classe principal do jogo
    public static final int MANUFACTURED_CARS = 100;

    /**
     * Container of Cars
     */
    private Car[] cars; // Array de carros

    /**
     * Animation delay
     */
    private int delay;
    // Construtor que inicializa o campo e o delay
    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);  // Inicializa o campo com a largura e altura
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];  // Inicializa o array com a quantidade de carros
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();  // Cria novos carros usando a fábrica de carros
        }

        Field.draw(cars);  // Desenha os carros no campo

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }

    }

    // Metodo que move todos os carros
    public void moveAllCars() {
        // Todos os carros escolhem uma posição e movem-se se não colidiram
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isCrashed()) {
                cars[i].carDirection();  // Mover o carro para uma nova direção
            }
        }


        // Verificar colisões entre os carros
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {  // Comparar com os carros restantes{
                if (!cars[i].isCrashed() && !cars[j].isCrashed() && cars[i].getPos().equals(cars[j].getPos())) {
                    // Colisão detectada
                    cars[i].setCrashed(true);  // Marcar o carro i como colidido
                    cars[j].setCrashed(true);  // Marcar o carro j como colidido
                    System.out.println("Car " + i + " and Car " + j + " crashed at position: "
                            + cars[i].getPos().getRow() + ", " + cars[i].getPos().getCol());
                }
            }
        }
    }
}


