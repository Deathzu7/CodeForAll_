package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 50;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

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
    private void moveAllCars() {
        // Todos os carros escolhem uma posicao e movem se
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isCrashed()) {
                cars[i].carDirection(); // mover pa3ra uma nova direcao

            }
        }
        // Verificar colisões entre os carros
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {  // Comparar com os carros restantes
                if (!cars[i].isCrashed() && !cars[j].isCrashed()) {
                    // Comparar diretamente as coordenadas
                    if (cars[i].getPos().getRow() == cars[j].getPos().getRow() &&
                            cars[i].getPos().getCol() == cars[j].getPos().getCol()) {
                        // Colisão detectada
                        cars[i].setCrashed(true);  // Marcar o carro i como colidido
                        cars[j].setCrashed(true);  // Marcar o carro j como colidido}
                    }
                }
            }
        }
    }
}