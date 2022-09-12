package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import co.edu.unbosque.views.AddModifyView;
import co.edu.unbosque.views.ConsoleView;
import co.edu.unbosque.views.MainView;

public class AddModifyViewController implements ActionListener {

	AddModifyView addModifyView;
	MainView mainView;
	ConsoleView consoleView = new ConsoleView();

	public AddModifyViewController() {
		mainView = new MainView();
		addModifyView = new AddModifyView();
		addListeners();
	}

	private void addListeners() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	private void btnAdd_Event(Object source, JButton btnAdd) {
		if (source.equals(btnAdd)) {
			mainView.setVisible(false);
			addModifyView.setVisible(true);
		}
	}

}
