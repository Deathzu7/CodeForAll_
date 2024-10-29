package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.GridColor;
import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.crypto.spec.RC2ParameterSpec;

public class SimpleGfxGrid implements Grid {


    public static final int PADDING = 10;
    public int cols;
    public int rows;

    public static final int CELL_SIZE = 20;

    public SimpleGfxGrid(int cols, int rows){ //Em simplegraphics sabemos que isto tem de ser convertido para pixeis
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {                //    Onde começa  - numero de colunas X cell zise
        Rectangle rectangle = new Rectangle(PADDING, PADDING, this.cols*this.getCellSize(), this.rows*this.getCellSize());
        rectangle.draw();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return this.cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return this.rows;
    }

    /**
     * Obtains the width of the grid in pixels
     * @return the width of the grid
     */
    public int getWidth() {
        return this.cols * getCellSize();
    }
    //Retorna a largura da grid. Representação grafica é colunas X cellSize.
    // Como é um retangulo obetenho a largura do meu retangulo X cellSize.
    /**
     * Obtains the height of the grid in pixels
     * @return the height of the grid
     */
    public int getHeight() {
        return this.rows * getCellSize();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     * @return the x position of the grid
     */
    public int getX() {
        return PADDING;
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     * @return the y position of the grid
     */
    public int getY() {
        return PADDING;
    }

    /**
     * Obtains the pixel width and height of a grid position
     * @return
     */
    public int getCellSize() {
        return CELL_SIZE;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);

    }
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        GridPosition gridPosition = new SimpleGfxGridPosition(col, row,this);
       return gridPosition;
    }
    //Simplegraphics representa o meu grid. Este metodo iria criar uma posicao em si.
    //Retorna algo do tipo GridPosition, tem de retornara algo do tipo.
    // this referece a instancia que Invocou o metodo. Se eu tivesse 20 instancias, o this era à instancia que esta a invocar o metodo.
    // Tal como o super referece à super classe daquela instancia.


    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        //throw new UnsupportedOperationException();
        // The conversion of logical position to graphical position
        return row * getCellSize() + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        //throw new UnsupportedOperationException();
        // The conversion of logical position to graphical position
        return column * getCellSize() + PADDING;
    }
}
