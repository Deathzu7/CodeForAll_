package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

abstract  public class Car {
// classe abstrata que representa um carro generico
    /** The position of the car on the grid */
    private Position pos; // posicao do carro no campo
    private boolean crashed; // "flag" para saber se o carro colidiu ou nao
    private int speed; // movimento diferente entre carros.

    // Construtor que inicializa a posicao do carro e define crashed como falso
    public Car(Position pos){
        this.pos = pos;
        this.crashed = false;
    }

    public Position getPos() {
        return pos;
    }
// Retorna se o carro colidiu ou nao.
    public boolean isCrashed() {
        return crashed;
    }
// Retorna o estado de colisão do carro
    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Metodo para determinar a direçao do carro de forma aleatoria
    public void carDirection(){
        int direction = (int) (Math.random() * 4); // Gera 4 direçoes possiveis

        // Atualiza a posição do carro com base na direcao escolhida
        switch (direction){ //

            case 0:
                if (pos.getRow() > 0){ // Verifica se o carro pode mover se para cima
                    pos.setRow(pos.getRow() -1);
                }break;

            case 1:
                if (pos.getRow() < Field.getHeight() - 1){
                    pos.setRow(pos.getRow() +1);
                }break;

            case 2:
                if (pos.getCol() > 0){
                    pos.setCol(pos.getCol() -1);
                }break;

            case 3:
                if (pos.getCol() < Field.getWidth() -1){
                    pos.setCol(pos.getCol() +1);
                }break;
        }

    }
    public void setSpeed(){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
