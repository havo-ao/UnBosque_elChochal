package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import co.edu.unbosque.views.AddModifyView;
import co.edu.unbosque.views.ConsoleView;
import co.edu.unbosque.views.MainView;

public class MainViewController implements ActionListener {

	MainView mainView;
	AddModifyView addModifyView;
	ConsoleView consoleView = new ConsoleView();

	public MainViewController() {
		mainView = new MainView();
		addModifyView = new AddModifyView();
		mainView.setVisible(true);
		addListeners();
	}

	private void addListeners() {
		mainView.getBtnAdd().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btnAdd_Event(e.getSource(), mainView.getBtnAdd());

	}

	private void btnAdd_Event(Object source, JButton btnAdd) {
		if (source.equals(btnAdd)) {
			mainView.setVisible(false);
			addModifyView.setVisible(true);
		}
	}

}
