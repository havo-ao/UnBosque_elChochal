package co.edu.unbosque.controllers;

import co.edu.unbosque.models.Products_implementor;
import co.edu.unbosque.views.WindowAddOrModify;
import co.edu.unbosque.views.WindowFindOrDelete;
import co.edu.unbosque.views.WindowMainView;

public class MainApp {

	private WindowMainView mainView;
	private WindowAddOrModify addView;
	private WindowAddOrModify modifyView;
	private WindowFindOrDelete findOrDeleteView;
	private Products_implementor productsOperations;
	private Controller controller;

	public static void main(String[] args) {
		new MainApp().start();
	}

	private void start() {
		initializeViews();
		initializeModels();
		initializeControllers();

		setControllerToViews();
		setControllerToModels();

		setViewsToController();
		setModelsToController();

		controller.start();
	}

	private void initializeViews() {
		mainView = new WindowMainView();
		addView = new WindowAddOrModify();
		modifyView = new WindowAddOrModify();
		findOrDeleteView = new WindowFindOrDelete();
	}

	private void setControllerToViews() {
		mainView.setController(controller);
		addView.setController(controller);
		modifyView.setController(controller);
		findOrDeleteView.setController(controller);
	}

	private void setControllerToModels() {

	}

	private void setViewsToController() {
		controller.setMainView(mainView);
		controller.setAddView(addView);
		controller.setModifyView(modifyView);
		controller.setFindOrDeleteView(findOrDeleteView);
	}

	private void setModelsToController() {
		controller.setProductsOperations(productsOperations);

	}

	private void initializeModels() {
		productsOperations = new Products_implementor();

	}

	private void initializeControllers() {
		controller = new Controller();
	}
}
