package co.edu.unbosque.models;

import java.util.Date;

public class Nitrogen extends Frozen {

	String frozenMethod;
	int expositionTime;

	public Nitrogen(Date expirationDate, String batchNumber, Date packingDate, String originCountry, double temperature,
			String frozenMethod, int expositionTime) {
		super(expirationDate, batchNumber, packingDate, originCountry, temperature);

		this.frozenMethod = frozenMethod;
		this.expositionTime = expositionTime;

	}

	public String getFrozenMethod() {
		return frozenMethod;
	}

	public void setFrozenMethod(String frozenMethod) {
		this.frozenMethod = frozenMethod;
	}

	public int getExpositionTime() {
		return expositionTime;
	}

	public void setExpositionTime(int expositionTime) {
		this.expositionTime = expositionTime;
	}

}
