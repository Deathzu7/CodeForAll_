package io.codeforall.fanstatics;
import io.codeforall.fanstatics.gfx.simplegfx.SimpleGfxGrid;
import io.codeforall.fanstatics.gfx.simplegfx.SimpleGfxGridPosition;
import io.codeforall.fanstatics.grid.Grid;
import io.codeforall.fanstatics.grid.GridColor;
import io.codeforall.fanstatics.grid.GridDirection;
import io.codeforall.fanstatics.grid.SimpleGfxGridFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler {
    private int cols;
    private int rows;
    private Keyboard keyboard;
    private SimpleGfxGrid grid;
    private SimpleGfxGridPosition[][] positions;
    private boolean[][] blackOn;
    private SimpleGfxGridPosition cursor;

    public Game(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.grid = SimpleGfxGridFactory.makeGrid(cols, rows);
        this.grid.init();
        this.positions = new SimpleGfxGridPosition[this.grid.getCols()][this.grid.getRows()];
        this.blackOn = new boolean[this.grid.getCols()][this.grid.getRows()];
        for (int i = 0; i < this.grid.getCols(); i++) {
            for (int j = 0; j < this.grid.getRows(); j++) {
                this.positions[i][j] = new SimpleGfxGridPosition(i, j, this.grid);
                this.blackOn[i][j] = false;
            }
        }
        this.cursor = new SimpleGfxGridPosition(0, 0, this.grid);
        this.cursor.setColor(GridColor.GREEN);

        initKeyboard();
    }


    public void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(moveDown);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                this.cursor.moveInDirection(GridDirection.RIGHT, 1);
                break;
            case KeyboardEvent.KEY_LEFT:
                this.cursor.moveInDirection(GridDirection.LEFT, 1);
                break;
            case KeyboardEvent.KEY_UP:
                this.cursor.moveInDirection(GridDirection.UP, 1);
                break;
            case KeyboardEvent.KEY_DOWN:
                this.cursor.moveInDirection(GridDirection.DOWN, 1);
                break;

        }
    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }




}
