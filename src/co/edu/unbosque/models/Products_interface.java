package co.edu.unbosque.models;

import java.util.ArrayList;

public interface Products_interface {
	
	void create(ArrayList<Products> products, Products product);

	Products get(ArrayList<Products> products, String batchNumber);

	void delete(ArrayList<Products> products, String batchNumber);

	void modify(ArrayList<Products> products, String batchNumber, Products product);

	String getAll(ArrayList<Products> products);

}
