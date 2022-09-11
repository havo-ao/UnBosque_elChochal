package co.edu.unbosque.models;

import java.util.Date;

public class Air extends Frozen {

	double nitrogenComposition, oxigenComposition, co2Composition, steamComposition;

	public Air(Date expirationDate, String batchNumber, Date packingDate, String originCountry, double temperature,
			double nitrogenComposition, double oxigenComposition, double co2Composition, double steamComposition) {
		
		super(expirationDate, batchNumber, packingDate, originCountry, temperature);

		this.nitrogenComposition = nitrogenComposition;
		this.oxigenComposition = oxigenComposition;
		this.co2Composition = co2Composition;
		this.steamComposition = steamComposition;

	}

	public double getNitrogenComposition() {
		return nitrogenComposition;
	}

	public void setNitrogenComposition(double nitrogenComposition) {
		this.nitrogenComposition = nitrogenComposition;
	}

	public double getOxigenComposition() {
		return oxigenComposition;
	}

	public void setOxigenComposition(double oxigenComposition) {
		this.oxigenComposition = oxigenComposition;
	}

	public double getCo2Composition() {
		return co2Composition;
	}

	public void setCo2Composition(double co2Composition) {
		this.co2Composition = co2Composition;
	}

	public double getSteamComposition() {
		return steamComposition;
	}

	public void setSteamComposition(double steamComposition) {
		this.steamComposition = steamComposition;
	}

}