package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalculatorEngine implements ActionListener {

	Calculator parent;
	char selectedAction = ' '; // +, -, /, or *
	double currentResult = 0;

	// constructor saves calc's instatnce in var class
	public CalculatorEngine(Calculator parent) {
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Get the event source
		JButton clickedButton = (JButton) e.getSource();

		String dispFieldText = parent.displayField.getText();
		double displayValue = 0;
		// We get text from the display
		if (!"".equals(dispFieldText)) {
			displayValue = Double.parseDouble(dispFieldText);
		}
		Object src = e.getSource();
		// get button's info

		if (src == parent.buttonPlus) {
			selectedAction = '+';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMinus) {
			selectedAction = '-';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonDivide) {
			selectedAction = '/';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMultiply) {
			selectedAction = '*';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonEqual) {
			// —овершить арифметическое действие, в зависимости
			// от selectedAction, обновить переменную currentResult
			// и показать результат на дисплее
			if (selectedAction == '+') {
				currentResult += displayValue;
				// —конвертировать результат в строку, добавл€€ его
				// к пустой строке и показать его
				parent.displayField.setText(" " + currentResult);
			} else if (selectedAction == '-') {
				currentResult -= displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '/') {
				if(displayValue==0) {
					parent.displayField.setText("" + "хер табе, а не дз€ленне на 0");
				}else {
				currentResult /= displayValue;
				parent.displayField.setText("" + currentResult);}
			} else if (selectedAction == '*') {

				currentResult *= displayValue;
				parent.displayField.setText("" + currentResult);
			}
		} else {
			// ƒл€ всех цифровых кнопок присоединить надпись на
			// кнопке к надписи в дисплее
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
		}

		// Add the text on the button to the text of the message box
//		JOptionPane.showConfirmDialog(null, "You pressed " + dispFieldText, "Just a test", JOptionPane.PLAIN_MESSAGE);

//	toast	
//		JOptionPane.showConfirmDialog(null, "Something happened...", "Just a test", 
//				JOptionPane.PLAIN_MESSAGE);
	}
}

// page 116