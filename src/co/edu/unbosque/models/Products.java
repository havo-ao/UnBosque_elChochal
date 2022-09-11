package co.edu.unbosque.models;

import java.util.Date;

public class Products {

	protected Date expirationDate, packingDate;
	protected String batchNumber, originCountry;

	public Products(Date expirationDate, String batchNumber, Date packingDate, String originCountry) {
		this.expirationDate = expirationDate;
		this.batchNumber = batchNumber;
		this.packingDate = packingDate;
		this.originCountry = originCountry;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getPackingDate() {
		return packingDate;
	}

	public void setPackingDate(Date packingDate) {
		this.packingDate = packingDate;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

}
