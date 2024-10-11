package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.security.Key;

public class Fan implements KeyboardHandler {

    private Picture muscle;
    private Picture gym;
    private Keyboard keyboard;

    public Fan() {
        gym = new Picture(300,200,"rsc/gym1.jpeg");
        gym.draw();

        muscle = new Picture(15, 15, "rsc/images.png");
        muscle.draw();


        initKeyboard();
    }

    public void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        KeyboardEvent moveLeft = new KeyboardEvent();
        KeyboardEvent moveUp = new KeyboardEvent();
        KeyboardEvent moveDown = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);
        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveUp);
        keyboard.addEventListener(moveDown);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                muscle.translate(100, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                muscle.translate(-100, 0);
                break;
            case KeyboardEvent.KEY_UP:
                muscle.translate(0,-100);
                break;
            case KeyboardEvent.KEY_DOWN:
                muscle.translate(0,100);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
