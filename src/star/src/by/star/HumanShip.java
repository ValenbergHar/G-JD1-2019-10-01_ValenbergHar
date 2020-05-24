package by.star;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class HumanShip extends Ship {
    public HumanShip() {
        try {
            avatar = ImageIO.read(new File("Spaceship.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public HumanShip(int x, int y) {
        this();
        moveTo(x, y);
    }

    @Override
    public void toAttack() {

    }
}
