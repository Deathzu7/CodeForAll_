package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.GridColor;
import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;
    private GridColor currentColor;


    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) { //Do not modify this constructor
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        this.simpleGfxGrid = grid;
        this.rectangle = new Rectangle(grid.columnToX(this.getCol()), grid.rowToY(this.getRow()), SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);

        //throw new UnsupportedOperationException();
    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        this.simpleGfxGrid = grid;
        this.rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row), SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);


        this.rectangle.setColor(Color.BLUE);
        this.show();
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        //throw new UnsupportedOperationException();
        this.rectangle.setColor(Color.GREEN);
        this.rectangle.draw();
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        //throw new UnsupportedOperationException();
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
        // Incovar moveInDirection da minha superclass. Entao agora preciso de mover o retangulo. Invoco o translate sobre o retangulo.
        // Quero mexer para o mesmo sitio que o meu carro logico mexeu. Para desenhar o carro nessa posicao grafica.
       // Guardar a posiçao x antes de eu lhe pedir para mexer:
        int beforePosX = simpleGfxGrid.columnToX(super.getCol());
        int beforePosY = simpleGfxGrid.rowToY(super.getRow());

        // Agora mexe-se logicamente apenas
        super.moveInDirection(direction, distance);

        // Aqui agr ou a coluna ou a row vao mudar. E recebo os valores.
        int afterPosX = simpleGfxGrid.columnToX(super.getCol());
        int afterPosY = simpleGfxGrid.rowToY(super.getRow());
        // Agora mexe-se graficamente
        //this.rectangle.translate(grid.columnToX(getCol()) - rectangle.getX(), grid.rowToY(getRow()) - rectangle.getY());
        this.rectangle.translate(afterPosX-beforePosX, afterPosY - beforePosY); // Vou perceber a diferença entre os dois.
    }

///
    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) { // DAR COR A UM RETANGULO
        // throw new UnsupportedOperationException();
        super.setColor(color);
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        // MUDEI A COR GRAFICA, FALTA DIZER AO PROGRAMA PARA MUDAR PARA COR LOGICA. É O SUPER CA ABSTRACT GFXGRID.


//TRANSFORMA UTILITARIAMENTE UMA GRIDCOLOR PARA COLOR.
        // INVOCAR O METODO GETCOLOR DA CLASSE SIMPLEGFXCOLORMAPPER.

//SEMPRE QUE É UM METODO STATIC É UM METODO UTILITARIO
    }
}