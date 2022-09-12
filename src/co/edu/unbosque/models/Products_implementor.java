package co.edu.unbosque.models;

import java.util.ArrayList;

public class Products_implementor implements Products_interface {

	@Override
	public void create(ArrayList<Products> products, Products product) {
		products.add(product);
	}

	@Override
	public Products getByBatch(ArrayList<Products> products, String batchNumber) {

		for (Products product : products) {
			boolean isFound = product.getBatchNumber() == batchNumber;

			if (isFound)
				return product;
		}

		return null;
	}

	@Override
	public void delete(ArrayList<Products> products, String batchNumber) {
		Products productFound = getByBatch(products, batchNumber);

		boolean isFound = productFound != null;

		if (isFound)
			products.remove(productFound);

	}

	@Override
	public void modify(ArrayList<Products> products, String batchNumber, Products product) {
		boolean isFound = getByBatch(products, batchNumber) != null;

		if (isFound) {
			delete(products, batchNumber);
			create(products, product);
		}
	}

	@Override
	public String getAll(ArrayList<Products> products) {
		return null;
	}
}
