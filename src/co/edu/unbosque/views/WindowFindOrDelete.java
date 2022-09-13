package co.edu.unbosque.views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.controllers.Controller;

@SuppressWarnings("serial")
public class WindowFindOrDelete extends JFrame {
	
	private Controller controller;

	private JButton btnBack = new JButton("Volver al menú");

	private JLabel lblLoteTitle = new JLabel("Lote:");
	private JTextField txtLote = new JTextField();
	private JButton btnLote = new JButton("Buscar por Lote");

	private JLabel lblExpDate = new JLabel("Fecha de Expiración");
	private JTextField txtExpDate = new JTextField();
	private JButton btnExpDate = new JButton("Buscar por Fecha");

	private JLabel lblResults = new JLabel("Resultados");
	private JPanel panelResults = new JPanel();

	private JLabel lblDeleteLote = new JLabel("Lote");
	private JTextField txtDeleteLote = new JTextField();
	private JButton btnDeleteLote = new JButton("Eliminar producto");

	public WindowFindOrDelete() {
		setSize(750, 340);
		setTitle("Agroalimentos El Chochal | Buscar / Eliminar un producto");
		setLocationRelativeTo(null);

		initializeComponents();
	}

	private void initializeComponents() {
		setLayout(null);

		addComponent_lblLoteTitle();
		addComponent_txtLote();
		addComponent_btnLote();
		addComponent_lblExpDate();
		addComponent_txtExpDate();
		addComponent_btnExpDate();
		addComponent_lblResults();
		addComponent_lblDeleteLote();
		addComponent_txtDeleteLote();
		addComponent_btnDeleteLote();
		addComponent_panelResults();
		addComponent_btnBack();
	}

	private void addComponent_btnBack() {
		btnBack.setBounds(10, 10, 120, 20);
		add(btnBack);
	}

	private void addComponent_lblLoteTitle() {
		lblLoteTitle.setBounds(10, 35, 50, 20);
		add(lblLoteTitle);
	}

	private void addComponent_txtLote() {
		txtLote.setBounds(60, 35, 100, 20);
		add(txtLote);
	}

	private void addComponent_btnLote() {
		btnLote.setBounds(160, 35, 130, 20);
		add(btnLote);
	}

	private void addComponent_lblExpDate() {
		lblExpDate.setBounds(300, 35, 120, 20);
		add(lblExpDate);
	}

	private void addComponent_txtExpDate() {
		txtExpDate.setBounds(420, 35, 100, 20);
		add(txtExpDate);
	}

	private void addComponent_btnExpDate() {
		btnExpDate.setBounds(520, 35, 140, 20);
		add(btnExpDate);
	}

	private void addComponent_lblResults() {
		lblResults.setBounds(10, 60, 100, 20);
		add(lblResults);
	}

	private void addComponent_panelResults() {
		panelResults.setBounds(5, 80, 730, 100);
		panelResults.setBackground(new Color(168, 199, 157));
		add(panelResults);
	}

	private void addComponent_lblDeleteLote() {
		lblDeleteLote.setBounds(10, 190, 50, 20);
		add(lblDeleteLote);
	}

	private void addComponent_txtDeleteLote() {
		txtDeleteLote.setBounds(60, 190, 100, 20);
		add(txtDeleteLote);
	}

	private void addComponent_btnDeleteLote() {
		btnDeleteLote.setBounds(160, 190, 140, 20);
		add(btnDeleteLote);
	}

	// Getters & Setters

	public JLabel getLblLoteTitle() {
		return lblLoteTitle;
	}

	public void setLblLoteTitle(JLabel lblLoteTitle) {
		this.lblLoteTitle = lblLoteTitle;
	}

	public JTextField getTxtLote() {
		return txtLote;
	}

	public void setTxtLote(JTextField txtLote) {
		this.txtLote = txtLote;
	}

	public JButton getBtnLote() {
		return btnLote;
	}

	public void setBtnLote(JButton btnLote) {
		this.btnLote = btnLote;
	}

	public JLabel getLblExpDate() {
		return lblExpDate;
	}

	public void setLblExpDate(JLabel lblExpDate) {
		this.lblExpDate = lblExpDate;
	}

	public JTextField getTxtExpDate() {
		return txtExpDate;
	}

	public void setTxtExpDate(JTextField txtExpDate) {
		this.txtExpDate = txtExpDate;
	}

	public JButton getBtnExpDate() {
		return btnExpDate;
	}

	public void setBtnExpDate(JButton btnExpDate) {
		this.btnExpDate = btnExpDate;
	}

	public JLabel getLblResults() {
		return lblResults;
	}

	public void setLblResults(JLabel lblResults) {
		this.lblResults = lblResults;
	}

	public JLabel getLblDeleteLote() {
		return lblDeleteLote;
	}

	public void setLblDeleteLote(JLabel lblDeleteLote) {
		this.lblDeleteLote = lblDeleteLote;
	}

	public JTextField getTxtDeleteLote() {
		return txtDeleteLote;
	}

	public void setTxtDeleteLote(JTextField txtDeleteLote) {
		this.txtDeleteLote = txtDeleteLote;
	}

	public JButton getBtnDeleteLote() {
		return btnDeleteLote;
	}

	public void setBtnDeleteLote(JButton btnDeleteLote) {
		this.btnDeleteLote = btnDeleteLote;
	}

	public void setController(Controller controller) {
		this.controller = controller;
		
	}

}