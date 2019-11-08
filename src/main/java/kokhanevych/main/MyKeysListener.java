package kokhanevych.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeysListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.out.println("Good job");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
