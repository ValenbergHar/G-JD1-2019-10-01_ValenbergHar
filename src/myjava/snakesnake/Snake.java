package snakesnake;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Snake {

	final String TITLE_OF_PROGRAM = "Snake";
	final String GAME_OVER = "GAME_OVER";
	final int POINT_RADIUS = 20;
	final int FILED_WIDTH = 30;
	final int FILED_HEIGHT = 20;
	final int START_SNAKE_DX = 6;
	final int START_SNAKE_DY = 28;
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
	Canvas canvasPanelCanvas;
	Random random = new Random();
	boolean gameOver = false;

	public static void main(String[] args) {
		new Snake().go();
	}

	private void go() {

	}

}
