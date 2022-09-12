package co.edu.unbosque.views;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Components extends JFrame {

	public Components() {
		// TODO Auto-generated constructor stub
	}

	public JButton addButton(JButton button, String text, int x, int y, int width, int height) {
		button.setText(text);
		button.setBounds(x, y, width, height);
		return button;
	}

	public JLabel addLabel(JLabel label, String text, int x, int y, int width, int height, int aligment,
			String imagePath) {
		label.setText(text);
		label.setBounds(x, y, width, height);
		if (!imagePath.equals("")) {
			label.setIcon(new ImageIcon(imagePath));
		}
		label.setHorizontalAlignment(aligment);
		return label;
	}
	
	public JTextField addTextInput(JTextField textInput, String text, int x, int y, int width, int height) {
		textInput.setText(text);
		textInput.setBounds(x, y, width, height);
		return textInput;
	}

}
