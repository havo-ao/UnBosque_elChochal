package co.edu.unbosque.models;

import java.util.Date;

public class Refrigerated extends Products {

	public Refrigerated(Date expirationDate, String batchNumber, Date packingDate, String originCountry) {
		super(packingDate, originCountry, packingDate, originCountry);
	}

}
