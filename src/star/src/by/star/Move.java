package by.star;

public interface Move {

    boolean LEFT = false, RIGHT = false, UP = false, DOWN = false;
    void moveTo(int x, int y);
    void move();


}
