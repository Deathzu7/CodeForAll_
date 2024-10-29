package io.codeforall.bootcamp.field;

import java.util.Objects;

public class Position {
    // Classe Position que representa a posição do carro no campo
    private int col; // Coluna do carro
    private int row; // Linha do carro

    // Construtor que define a linha e a coluna
    public Position (int row, int col){
        this.col = col;
        this.row = row;
    }
    // Retorna a coluna atual
    public int getCol() {       //PARA SABER A POSICAO ATUAL" "
        return col;
    }
    // Define a coluna atual
    public void setCol(int col) {       // PARA MODIFICAR O VALOR PARA O ATUAL ONDE ESTA
        this.col = col;
    }
    // Retorna a linha atual
    public int getRow() {
        return row;
    }
    // Define a linha atual

    public void setRow(int row) {
        this.row = row;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Comparando a mesma referência
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Se o objeto não é da classe Position, retorna false
        }
        Position other = (Position) obj;
        return this.row == other.row && this.col == other.col;  // Compara valores de row e col
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);  // Gera hash baseado nos valores de row e col
    }
}
