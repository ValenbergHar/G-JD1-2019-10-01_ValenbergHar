package by.star;

import java.awt.*;

public abstract class Ship implements Move, toAttack {
    private int x=10, y=10;
    protected boolean LEFT = false, RIGHT = false, UP = false, DOWN = false;
    private double rotate=0.5;
    private int speed=10;
    protected Image avatar;

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move() {

    }

    @Override
    public abstract void toAttack();

    public void draw(Graphics g){

        if (avatar == null) {
            g.drawRect(x, y, 50, 50);
        }else{
            Graphics2D graphics2D = (Graphics2D)g;
            graphics2D.rotate(rotate, x+avatar.getHeight(null)/2, y+avatar.getHeight(null)/2);
            graphics2D.drawImage(avatar, x, y, null);
            graphics2D.rotate(-rotate, x+avatar.getHeight(null)/2, y+avatar.getHeight(null)/2);


        }
    }
}
