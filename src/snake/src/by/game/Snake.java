package by.game;

import java.awt.*;
import java.util.LinkedList;

public class Snake {
    private LinkedList<Rectangle> linkedList = new LinkedList<>();
    private int w = 30, h = 30;
    public static final int LEFT = 0, RIGHT = 1, UP = 2, DOWN = 3;

    public Snake() {
        linkedList.add(new Rectangle(20, 20, w, h));
        linkedList.add(new Rectangle(20 + w, 20, w, h));
        linkedList.add(new Rectangle(20 + 2 * w, 20, w, h));
    }

    public void moveTo(int to) {
        Rectangle head = (Rectangle) linkedList.getFirst().clone();
        linkedList.pollLast();
        switch (to) {

            case LEFT:
                head.x -= w;
                break;
            case RIGHT:
                head.x += w;
                break;
            case UP:
                head.y -= h;
                break;
            case DOWN:
                head.y += h;
                break;
        }
        linkedList.addFirst(head);
    }

    public void draw(Graphics g) {
        for (Rectangle r : linkedList
        ) {
            g.drawRect(r.x, r.y, w, h);
        }
    }
}