package swing;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
//Announcement of all calculator components.
	JPanel windowContent;
	JTextField displayField;
	JButton buttonPoint;
	JButton buttonEqual;
	JPanel p1;
	JPanel p2;

// All components are created in the constructor
	// and are added to the frame using a combination
	// Borderlayout and Gridlayout
	Calculator() {
		windowContent = new JPanel();
// We set the scheme for this panel
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
// Create and display a field
		// Add It To The North Area Of The Window
		displayField = new JTextField(30);
		windowContent.add("North", displayField);
// Create buttons using the constructor
		// JButton class that accepts text
		// buttons as a parameter

		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
// Create a panel with GridLayout
		// which contains 12 buttons - 10 buttons with numbers
		// and buttons with dot and equal sign
		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);
//Add buttons to p1 panel
		for (int i = 0; i < 9; i++) {
			p1.add(new JButton(Integer.toString(i + 1)));
		}
		p1.add(buttonPoint);
		p1.add(new JButton("0"));
		p1.add(buttonEqual);
// Place panel p1 in the center area of the window
		windowContent.add("Center", p1);

		JPanel p2 = new JPanel();
		GridLayout g2 = new GridLayout(4, 1);
		p2.setLayout(g2);
		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonDivide = new JButton("/");
		JButton buttonMultiply = new JButton("*");
		p2.add(buttonPlus);
		p2.add(buttonMinus);
		p2.add(buttonMultiply);
		p2.add(buttonDivide);
		windowContent.add("East", p2);

//Create a frame and set its main panel
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
// make the window size sufficient
		// in order to accommodate all componentsòû
		frame.pack();
// Finally, display the window
		frame.setVisible(true);
		CalculatorEngine calcEngine = new CalculatorEngine();
		buttonPlus.addActionListener(calcEngine);

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
}