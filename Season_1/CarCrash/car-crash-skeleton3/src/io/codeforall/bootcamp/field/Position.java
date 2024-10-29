package io.codeforall.bootcamp.field;

import java.util.Objects;

public class Position {

    public int col; // Guarda o valor da coluna do carro
    public int row;

    // Construtor que define a linha e coluna
    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }
    // Retorna a coluna atual;
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
    // Define a linha atual
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
