package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract public class Car {
// Classe abstrata Car que representa um carro genérico
    /**
     * The position of the car on the grid
     */
    /**
     * A posição do carro no campo de jogo (coluna e linha)
     */
    private Position pos;   // Posição do carro no campo
    private boolean crashed; // Flag para saber se o carro colidiu ou não
    private io.codeforall.bootcamp.field.Field Field;

// Construtor que inicializa a posição do carro e define crashed como false
    public Car(Position pos) {
        this.pos = pos;
        this.crashed = false;

    }
    // Retorna se o carro colidiu ou não
    public boolean isCrashed() {
        return crashed;
    }
    // Define o estado de colidido do carro
    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }
    // Retorna a posição atual do carro
    public Position getPos() {
        return pos;
    }




    // Metodo para determinar a direção do carro de forma aleatória
    public void carDirection() {
        int direction = (int) (Math.random() * 4);  // Gera um número aleatório entre 0 e 3, representando 4 direções possíveis

        // Atualiza a posição do carro com base na direção escolhida
        switch (direction) {
            case 0: // Mover para cima
                if (pos.getRow() > 0) {  // Verifica se o carro pode mover-se para cima
                    pos.setRow(pos.getRow() - 1);
                }
                break;

            case 1: // Mover para baixo
                if (pos.getRow() < Field.getHeight() - 1) {  // Verifica se o carro pode mover-se para baixo
                    pos.setRow(pos.getRow() + 1);
                }
                break;

            case 2: // Mover para a direita
                if (pos.getCol() < Field.getWidth() - 1) {  // Verifica se o carro pode mover-se para a direita
                    pos.setCol(pos.getCol() + 1);
                }
                break;

            case 3: // Mover para a esquerda
                if (pos.getCol() > 0) {  // Verifica se o carro pode mover-se para a esquerda
                    pos.setCol(pos.getCol() - 1);
                }
                break;


        }
    }
    // Metodo toString, pode ser sobrescrito nas subclasses
    @Override
    public String toString() {
        return super.toString();
    }
}

