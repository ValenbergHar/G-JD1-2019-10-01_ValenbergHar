package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalculatorEngine implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		// Get the event source
		JButton clickedButton = (JButton) e.getSource();
		// We get the inscription on the button
		String clickedButtonLabel = clickedButton.getText();
		// Add the text on the button to the text of the message box
		JOptionPane.showConfirmDialog(null, "You pressed " + clickedButtonLabel, "Just a test",
				JOptionPane.PLAIN_MESSAGE);

//	toast	
//		JOptionPane.showConfirmDialog(null, "Something happened...", "Just a test", 
//				JOptionPane.PLAIN_MESSAGE);
	}
}



// page 100