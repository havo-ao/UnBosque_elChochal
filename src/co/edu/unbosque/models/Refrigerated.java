package co.edu.unbosque.models;

import java.util.Date;

public class Refrigerated extends Products {

	int supervisionCode;
	double temperature;

	public Refrigerated(Date expirationDate, String batchNumber, Date packingDate, String originCountry,
			int supervisionCode, double temperature) {
		super(packingDate, originCountry, packingDate, originCountry);

		this.supervisionCode = supervisionCode;
		this.temperature = temperature;

	}

}
