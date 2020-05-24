package by.star;

import javax.swing.*;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10, 500,500);
        jFrame.add(new GamePanel());
        jFrame.setVisible(true);

    }
}