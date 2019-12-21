package snakesnake;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SnakeGame {

	final String TITLE_OF_PROGRAM = "Snake";
	final String GAME_OVER = "GAME_OVER";
	final int POINT_RADIUS =20;
	final int FILED_WIDTH = 30;
	final int FILED_HEIGHT = 20;
	final int FILED_DX = 6;
	final int FILED_DY = 28;
	final int START_LOCATION = 200;
	final int START_SNAKE_SIZE = 6;
	final int START_SNAKE_X = 10;
	final int START_SNAKE_Y = 10;
	final int SHOW_DELAY = 150;
	final int LEFT = 37;
	final int UP = 38;
	final int RIGHT = 39;
	final int DOWN = 40;
	final int START_DIRECTION = RIGHT;
	final Color DEFAULT_COLOR = Color.BLACK;
	final Color FOOD_COLOR = Color.green;
	final Color POISON_Color = Color.red;
	Snake snake;
	// Food food;
	// Poison poison;
	JFrame frame;
	Canvas canvasPanel;
	Random random = new Random();
	boolean gameOver = false;

	public static void main(String[] args) {
		new SnakeGame().go();
	}

	private void go() {
		frame = new JFrame(TITLE_OF_PROGRAM + " : " + START_SNAKE_SIZE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FILED_WIDTH * POINT_RADIUS + FILED_DX, FILED_HEIGHT * POINT_RADIUS + FILED_DY);
		frame.setLocation(START_LOCATION, START_LOCATION);
		frame.setResizable(false);

		canvasPanel = new Canvas();
		canvasPanel.setBackground(Color.white);

		frame.getContentPane().add(BorderLayout.CENTER, canvasPanel);
		frame.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// snake.setDirection(e.getKeyCode());
				System.out.println(e.getKeyCode());
			}
		});
		frame.setVisible(true);
		
		snake = new Snake(START_SNAKE_X, START_SNAKE_Y , START_SNAKE_SIZE, START_DIRECTION);
	}

	class Snake {
		ArrayList<Point> snake = new ArrayList<Point>();
		int direction;

		public Snake(int x, int y, int length, int direction) {
			for (int i = 0; i < length; i++) {
				Point point = new Point(x - i, y);
				snake.add(point);
			}
			this.direction = direction;
		}

		void paint(Graphics g) {
			for (Point point : snake) {
				point.paint(g);
			}

		}
	}

	class Point {
		int x, y;
		Color color = DEFAULT_COLOR;

		public Point(int x, int y) {
			this.setXY(x, y);

		}

		void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x * POINT_RADIUS, y * POINT_RADIUS, POINT_RADIUS, POINT_RADIUS);
		}

		private void setXY(int x2, int y2) {
			this.x = x;
			this.y = y;
		}

	}

	public class Canvas extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			snake.paint(g);
		}
	}

}
