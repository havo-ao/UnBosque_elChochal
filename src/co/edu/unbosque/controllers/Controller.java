package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.edu.unbosque.views.MainView;

public class Controller {

	DateFormat dateFormatter = new SimpleDateFormat("dd-mm-yy");

	public Controller() {
		initializeViews();
	}
	
	public void initializeViews() {
		MainViewController mainView = new MainViewController();
		AddModifyViewController addModifyView = new AddModifyViewController();
	}

	public Date dateParser(String dateString) throws ParseException {
		return dateFormatter.parse(dateString);
	}

}
