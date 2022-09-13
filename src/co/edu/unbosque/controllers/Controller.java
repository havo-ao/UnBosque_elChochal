package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;

import co.edu.unbosque.models.Fresh;
import co.edu.unbosque.models.Products;
import co.edu.unbosque.models.Products_implementor;
import co.edu.unbosque.models.Utils;
import co.edu.unbosque.views.WindowAddOrModify;
import co.edu.unbosque.views.WindowFindOrDelete;
import co.edu.unbosque.views.WindowMainView;

public class Controller implements ActionListener, ItemListener {

	private WindowMainView mainView;
	private WindowAddOrModify addView;
	private WindowAddOrModify modifyView;
	private WindowFindOrDelete findOrDeleteView;
	private Products_implementor productsOperations;
	private Utils utils;

	private ArrayList<Products> productsList;

	public Controller() {
	}

	public void start() {
		productsList = new ArrayList<>();
		mainView.setVisible(true);
		addListeners();
	}

	private void addListeners() {
		mainView.getBtnAdd().addActionListener(this);
		mainView.getBtnModify().addActionListener(this);
		mainView.getBtnFindDelete().addActionListener(this);

		addView.getBtnReturn().addActionListener(this);
		addView.getBtnSaveProduct().addActionListener(this);
		addView.getCmbProductType().addItemListener(this);

		modifyView.getBtnReturn().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			btnAdd_Event(e.getSource(), mainView.getBtnAdd());
			btnModify_Event(e.getSource(), mainView.getBtnModify());
			btnFindOrDelete_Event(e.getSource(), mainView.getBtnFindDelete());

			btnBack_Event(e.getSource(), addView.getBtnReturn());
			btnSave_Event(e.getSource(), addView.getBtnSaveProduct());

			btnBackModify_Event(e.getSource(), modifyView.getBtnReturn());

		} catch (ParseException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		cmbProductType_Event(e.getSource(), addView.getCmbProductType());
	}

	// Events

	// Main
	private void btnAdd_Event(Object source, JButton button) {
		if (source.equals(button)) {
			mainView.setVisible(false);
			addView.setVisible(true);
			changeRefrigeratedComponentsStatus(addView, false);

		}
	}

	private void btnModify_Event(Object source, JButton button) {
		if (source.equals(button)) {
			mainView.setVisible(false);
			modifyView.setVisible(true);
			modifyView.setTitle("Modificar Producto");
		}
	}

	private void btnFindOrDelete_Event(Object source, JButton button) {
		if (source.equals(button)) {
			mainView.setVisible(false);
			findOrDeleteView.setVisible(true);
		}
	}

	// Add
	private void btnBack_Event(Object source, JButton button) {
		if (source.equals(button)) {
			addView.setVisible(false);
			mainView.setVisible(true);
		}
	}

	private void btnSave_Event(Object source, JButton button) throws ParseException {
		if (source.equals(button)) {
			String selection = (String) addView.getCmbProductType().getSelectedItem();

			if (selection.equals("Fresco")) {
				Date expirationDatem = utils.dateParser(addView.getTxtExpirationDate().getText());

				productsOperations.create(productsList,
						new Fresh(expirationDatem, addView.getTxtBatch().getText(), null, selection));

			} else if (selection.equals("Refrigerado")) {

			} else if (selection.equals("Congelado")) {
				String frozenType = (String) addView.getCmbFrozenType().getSelectedItem();

				if (frozenType.equals("Aire")) {

				} else if (frozenType.equals("Agua")) {

				} else if (frozenType.equals("Nitrogeno")) {

				}
			}
		}
	}

	private void cmbProductType_Event(Object source, JComboBox<String> comboBox) {
		if (source.equals(comboBox)) {
			String selection = (String) addView.getCmbProductType().getSelectedItem();

			if (selection.equals("Fresco")) {
				changeRefrigeratedComponentsStatus(addView, false);

			} else if (selection.equals("Refrigerado")) {
				changeRefrigeratedComponentsStatus(addView, true);

			} else if (selection.equals("Congelado")) {
				changeRefrigeratedComponentsStatus(addView, false);
			}

		}
	}

	public void changeRefrigeratedComponentsStatus(WindowAddOrModify view, boolean status) {
		view.getLblRegrigerated().setEnabled(status);
		view.getLblSupervisionCode().setEnabled(status);
		view.getLblTemperatureR().setEnabled(status);
		view.getTxtSupervisionCode().setEditable(status);
		view.getTxtTemperatureR().setEditable(status);
	}

	public void disableFrozenComponents(WindowAddOrModify view) {

	}

	// Modify
	private void btnBackModify_Event(Object source, JButton button) {
		if (source.equals(button)) {
			modifyView.setVisible(false);
			mainView.setVisible(true);
		}
	}

	public void setMainView(WindowMainView mainView) {
		this.mainView = mainView;
	}

	public void setProductsOperations(Products_implementor productsOperations) {
		this.productsOperations = productsOperations;

	}

	public void setAddView(WindowAddOrModify addView) {
		this.addView = addView;

	}

	public void setModifyView(WindowAddOrModify modifyView) {
		this.modifyView = modifyView;
	}

	public void setFindOrDeleteView(WindowFindOrDelete findOrDeleteView) {
		this.findOrDeleteView = findOrDeleteView;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;

	}

}
