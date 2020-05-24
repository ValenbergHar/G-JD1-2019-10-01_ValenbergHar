package by.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private int keyPressed = 0;
    private Snake snake = new Snake();


    class GameKey implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            keyPressed = e.getKeyCode();
            switch (e.getKeyCode()){
                case 37: snake.moveTo(Snake.LEFT);break;
                case 39: snake.moveTo(Snake.RIGHT);break;
                case 38: snake.moveTo(Snake.UP);break;
                case 40: snake.moveTo(Snake.DOWN);break;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    public GamePanel() {
        addKeyListener(new GameKey());
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.draw(g);
        g.drawString(""+keyPressed,10,10);
    }
}
