package co.edu.unbosque.models;

import java.util.Date;

public class Water extends Frozen {

	double gramsSalinity;

	public Water(Date expirationDate, String batchNumber, Date packingDate, String originCountry, double temperature,
			double gramsSalinity) {
		super(expirationDate, batchNumber, packingDate, originCountry, temperature);
		this.gramsSalinity = gramsSalinity;
	}

	public double getGramsSalinity() {
		return gramsSalinity;
	}

	public void setGramsSalinity(double gramsSalinity) {
		this.gramsSalinity = gramsSalinity;
	}

}
