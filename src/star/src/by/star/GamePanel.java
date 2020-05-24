package by.star;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    HumanShip humanShip = new HumanShip();


    private int x = 10, y = 10;

    public GamePanel() {
        new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humanShip.move();
                repaint();
            }
        }).start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        humanShip.draw(g);

    }
}
