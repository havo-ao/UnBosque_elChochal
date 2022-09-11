package co.edu.unbosque.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
	
	DateFormat dateFormatter;

	public Controller() {
		dateFormatter = new SimpleDateFormat("dd-mm-yy");	
		
	}
	
	public Date dateParser(String dateString) throws ParseException {
		return dateFormatter.parse(dateString);
	}

}
