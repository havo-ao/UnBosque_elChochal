package co.edu.unbosque.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public Utils() {
		// TODO Auto-generated constructor stub
	}
	
	public Date dateParser(String dateString) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("dd-mm-yy");
		return dateFormatter.parse(dateString);
	}

}
