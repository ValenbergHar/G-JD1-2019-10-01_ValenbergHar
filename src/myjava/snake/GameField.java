package snake;

import javax.swing.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import javax.swing.Timer;
import static java.io.File.separator;

public class GameField extends JPanel implements ActionListener {
	private final int SIZE = 320;
	private final int DOT_SIZE = 16;
	private final int ALL_DOTS = 400;
	private Image dot;
	private Image apple;
	private int appleX;
	private int appleY;
	private int[] x = new int[ALL_DOTS];
	private int[] y = new int[ALL_DOTS];
	private int dots;
	private Timer timer;
	private boolean left = false;
	private boolean right = true;
	private boolean up = false;
	private boolean down = false;
	private boolean inGame = true;

	public GameField() {
		setBackground(Color.BLACK);
		loadImages();
		initGame();

	}

	public void initGame() {
		dots = 3;
		for (int i = 0; i < dots; i++) {
			x[i] = 48 - i * DOT_SIZE;
			y[i] = 48;
		}
		timer = new Timer(250, this);
		timer.start();
		createApple();
	}

	public void createApple() {
		appleX = new Random().nextInt(20) * DOT_SIZE;
		appleY = new Random().nextInt(20) * DOT_SIZE;
	}

	public void loadImages() {
		ImageIcon iia = new ImageIcon("src" + separator + "main" + separator + "java" + separator + "apple.png");
		apple = iia.getImage();
		ImageIcon iid = new ImageIcon("src" + separator + "main" + separator + "java" + separator + "dot.png");
		apple = iid.getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (inGame) {
			g.drawImage(apple, appleX, appleY, this);
			for (int i = 0; i < dots; i++) {
				g.drawImage(dot, x[i], y[i], this);
			}
		}
	}

	public void move() {
		for (int i = dots; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
		if (left) {
			x[0] -= DOT_SIZE;
		}
		if (right) {
			x[0] += DOT_SIZE;
		}
		if (up) {
			y[0] -= DOT_SIZE;
		}
		if (left) {
			y[0] += DOT_SIZE;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (inGame) {

		}
		repaint();
	}

}
