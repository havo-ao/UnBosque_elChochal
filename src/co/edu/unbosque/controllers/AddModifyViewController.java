package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import co.edu.unbosque.views.WindowAddOrModify;
import co.edu.unbosque.views.ConsoleView;
import co.edu.unbosque.views.WindowMainView;

public class AddModifyViewController {

	WindowAddOrModify addModifyView;
	WindowMainView mainView;
	ConsoleView consoleView = new ConsoleView();

	public AddModifyViewController() {
		mainView = new WindowMainView();
		addModifyView = new WindowAddOrModify();
	}

	public void addListeners(ActionListener actionListener) {
		addModifyView.getBtnReturn().addActionListener(actionListener);
	}

	public void btnBack_Event(Object source, JButton button) {
		if (source.equals(button)) {
			addModifyView.setVisible(false);
			mainView.setVisible(true);
		}
	}

}
