package co.edu.unbosque.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import co.edu.unbosque.controllers.Controller;

@SuppressWarnings("serial")
public class WindowMainView extends JFrame {

	private JButton btnAdd = new JButton();
	private JButton btnModify = new JButton();
	private JButton btnFindDelete = new JButton();
	private JLabel lblBanner = new JLabel();
	private JLabel lblWelcome = new JLabel();

	private Components component = new Components();
	
	private Controller controller;

	final int defaultWidth = 180;
	final int defaultHeight = 30;

	final int paddingX = 10;
	final int paddingY = 20;
	

	public WindowMainView() {
		setSize(750, 340);
		setTitle("Agroalimentos El Chochal");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		initializeComponents();
	}

	private void initializeComponents() {
		setLayout(null);

		add(component.addLabel(lblBanner, "", 0, 0, 750, 170, SwingConstants.LEFT,
				"src/co/edu/unbosque/views/el_chochal_min.png"));

		add(component.addLabel(lblWelcome, "Por favor seleccione la acción que desee realizar", 0, getRow(1), 750,
				defaultHeight, SwingConstants.CENTER, ""));

		add(component.addButton(btnAdd, "Agregar Producto", getCol(1), getRow(2), defaultWidth, defaultHeight));

		add(component.addButton(btnModify, "Modificar Producto", getCol(2), getRow(2), defaultWidth, defaultHeight));

		add(component.addButton(btnFindDelete, "Eliminar Producto", getCol(3), getRow(2), defaultWidth, defaultHeight));
	}

	private int getRow(int row) {
		return 190 + ((row - 1) * (defaultHeight + paddingY));
	}

	private int getCol(int col) {
		return 90 + ((col - 1) * (defaultWidth + paddingX));
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnModify() {
		return btnModify;
	}

	public void setBtnModify(JButton btnModify) {
		this.btnModify = btnModify;
	}

	public JButton getBtnFindDelete() {
		return btnFindDelete;
	}

	public void setBtnFindDelete(JButton btnFindDelete) {
		this.btnFindDelete = btnFindDelete;
	}

	public JLabel getLblBanner() {
		return lblBanner;
	}

	public void setLblBanner(JLabel lblBanner) {
		this.lblBanner = lblBanner;
	}

	public void setController(Controller controller) {
		this.controller = controller;

	}

}
