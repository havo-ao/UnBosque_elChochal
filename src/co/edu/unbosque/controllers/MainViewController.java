package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import co.edu.unbosque.views.WindowAddOrModify;
import co.edu.unbosque.views.ConsoleView;
import co.edu.unbosque.views.WindowMainView;

public class MainViewController implements ActionListener {

	WindowMainView mainView;
	WindowAddOrModify addModifyView;
	ConsoleView consoleView = new ConsoleView();
	
	AddModifyViewController addModifyViewController = new AddModifyViewController();

	public MainViewController() {
		mainView = new WindowMainView();
		addModifyView = new WindowAddOrModify();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btnAdd_Event(e.getSource(), mainView.getBtnAdd());
		
		addModifyViewController.btnBack_Event(e.getSource(), addModifyView.getBtnReturn());
	}

	private void btnAdd_Event(Object source, JButton button) {
		if (source.equals(button)) {
			mainView.setVisible(false);
			addModifyView.setVisible(true);
		}
	}

}
