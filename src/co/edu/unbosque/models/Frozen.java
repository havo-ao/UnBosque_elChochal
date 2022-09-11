package co.edu.unbosque.models;

import java.util.Date;

public class Frozen extends Products{
	
	double temperature;

	public Frozen(Date expirationDate, String batchNumber, Date packingDate, String originCountry, double temperature) {
		super(expirationDate, batchNumber, packingDate, originCountry);
		this.temperature=temperature;
		
	}

}
