package snake;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.sun.glass.ui.Timer;
import com.sun.prism.Image;

public class GameField extends JPanel {
	private final int SIZE = 320;
	private final int DOT_SIZE = 16;
	private final int ALL_DOTS = 400;
	private Image dot;
	private java.awt.Image apple;
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

	}

	public void loadImages() {
		ImageIcon iia = new ImageIcon("apple.png");
		apple = iia.getImage();
		ImageIcon iid = new ImageIcon("dot.png");
		apple = iid.getImage();
	}

}
