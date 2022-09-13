package co.edu.unbosque.views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import co.edu.unbosque.controllers.Controller;

public class WindowAddOrModify extends JFrame {

	private Controller setController;

	private JLabel lblBanner = new JLabel();
	private JLabel lblBatch = new JLabel();
	private JLabel lblProductType = new JLabel();
	private JLabel lblExpirationDate = new JLabel();
	private JLabel lblPackageDate = new JLabel();
	private JLabel lblOriginCountry = new JLabel();
	private JLabel lblRegrigerated = new JLabel();
	private JLabel lblSupervisionCode = new JLabel();
	private JLabel lblTemperatureR = new JLabel();
	private JLabel lblFrozen = new JLabel();
	private JLabel lblTemperatureC = new JLabel();
	private JLabel lblFrozenType = new JLabel();
	private JLabel lblFrozenAir = new JLabel();
	private JLabel lblN = new JLabel();
	private JLabel lblO = new JLabel();
	private JLabel lblCO2 = new JLabel();

	private JLabel lblSteam = new JLabel();
	private JLabel lblFrozenWater = new JLabel();
	private JLabel lblSalinity = new JLabel();
	private JLabel lblNitrogen = new JLabel();
	private JLabel lblMethod = new JLabel();
	private JLabel lblExpositionTime = new JLabel();

	private JTextField txtBanner = new JTextField();
	private JTextField txtBatch = new JTextField();
	private JTextField txtExpirationDate = new JTextField();
	private JTextField txtPackageDate = new JTextField();
	private JTextField txtOriginCountry = new JTextField();
	private JTextField txtSupervisionCode = new JTextField();
	private JTextField txtTemperatureR = new JTextField();
	private JTextField txtTemperatureC = new JTextField();
	private JTextField txtN = new JTextField();
	private JTextField txtO = new JTextField();
	private JTextField txtCO2 = new JTextField();
	private JTextField txtSteam = new JTextField();
	private JTextField txtSalinity = new JTextField();
	private JTextField txtMethod = new JTextField();
	private JTextField txtExpositionTime = new JTextField();

	private JComboBox<String> cmbProductType = new JComboBox<String>();
	private JComboBox<String> cmbFrozenType = new JComboBox<String>();

	private JButton btnReturn = new JButton();
	private JButton btnSaveProduct = new JButton();

	private Components component = new Components();

	final int defaultWidth = 180;
	final int defaultHeight = 30;

	final int paddingX = 10;
	final int paddingY = 10;

	public WindowAddOrModify() {
		setSize(800, 550);
		setTitle("Agregar productos");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		initializeComponents();
	}

	private void initializeComponents() {
		setLayout(null);

		addLabels();
		addTextInputs();
		addButtons();
		addComboBoxes();
	}
	
	private void addComboBoxes() {
		cmbProductType.setBounds(getCol(2), getRow(3), defaultWidth, defaultHeight);
		cmbProductType.addItem("Fresco");
		cmbProductType.addItem("Refrigerado");
		cmbProductType.addItem("Congelado");
		add(cmbProductType);
		
		cmbFrozenType.setBounds(getCol(2), getRow(3), defaultWidth, defaultHeight);
		cmbFrozenType.addItem("Fresco");
		cmbFrozenType.addItem("Refrigerado");
		cmbFrozenType.addItem("Congelado");
		add(cmbFrozenType);
		
		
	}

	private void addTextInputs() {
		add(component.addTextInput(txtBanner, "", getCol(2), getRow(2), defaultWidth, defaultHeight));

		add(component.addTextInput(txtBatch, "", getCol(2), getRow(4), defaultWidth, defaultHeight));

		add(component.addTextInput(txtExpirationDate, "", getCol(2), getRow(5), defaultWidth, defaultHeight));

		add(component.addTextInput(txtPackageDate, "", getCol(2), getRow(6), defaultWidth, defaultHeight));

		add(component.addTextInput(txtOriginCountry, "", getCol(2), getRow(8), defaultWidth, defaultHeight));

		add(component.addTextInput(txtSupervisionCode, "", getCol(2), getRow(9), defaultWidth, defaultHeight));

		add(component.addTextInput(txtTemperatureR, "", getCol(2), getRow(9), defaultWidth, defaultHeight));

		add(component.addTextInput(txtTemperatureC, "", getCol(4), getRow(2), defaultWidth, defaultHeight));

		add(component.addTextInput(txtN, "", getCol(3) + (defaultWidth / 2), getRow(5), defaultWidth / 2,
				defaultHeight));

		add(component.addTextInput(txtO, "", getCol(4) + (defaultWidth / 2), getRow(5), defaultWidth / 2,
				defaultHeight));

		add(component.addTextInput(txtCO2, "", getCol(3) + (defaultWidth / 2), getRow(6), defaultWidth / 2,
				defaultHeight));

		add(component.addTextInput(txtSteam, "", getCol(4) + (defaultWidth / 2), getRow(6), defaultWidth / 2,
				defaultHeight));

		add(component.addTextInput(txtSalinity, "", getCol(4), getRow(8), defaultWidth, defaultHeight));

		add(component.addTextInput(txtMethod, "", getCol(4), getRow(10), defaultWidth, defaultHeight));

		add(component.addTextInput(txtExpositionTime, "", getCol(4), getRow(11), defaultWidth, defaultHeight));

	}

	private void addButtons() {
		add(component.addButton(btnReturn, "<< Volver al Menu", getCol(1) - 10, getRow(1), defaultWidth,
				defaultHeight));
		add(component.addButton(btnSaveProduct, "Guardar Producto", getCol(1) - 10, getRow(11), defaultWidth,
				defaultHeight));
	}

	private void addLabels() {
		add(component.addLabel(lblBanner, "", 0, 0, 800, 50, SwingConstants.LEFT,
				"src/co/edu/unbosque/views/el_chochal_min.png"));

		add(component.addLabel(lblBatch, "Lote", getCol(1), getRow(2), defaultWidth, defaultHeight, SwingConstants.LEFT,
				""));

		add(component.addLabel(lblProductType, "Tipo de Producto", getCol(1), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblExpirationDate, "Fecha Expiracion", getCol(1), getRow(4), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblPackageDate, "Fecha Empacado", getCol(1), getRow(5), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblOriginCountry, "Pais de Origen", getCol(1), getRow(6), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblRegrigerated, "Productos Refrigerados", getCol(1), getRow(7), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

		add(component.addLabel(lblSupervisionCode, "Codigo Organismo Supervision", getCol(1), getRow(8), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));
		add(component.addLabel(lblTemperatureR, "Temperatura Mantenimiento", getCol(1), getRow(9), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

		add(component.addLabel(lblFrozen, "Productos Congelados", getCol(3), getRow(1), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblTemperatureC, "Temperatura Mantenimiento", getCol(3), getRow(2), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

		add(component.addLabel(lblFrozenType, "Tipo Congelado", getCol(3), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblFrozenAir, "Congelado por Aire", getCol(3), getRow(4), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblN, "% N", getCol(3), getRow(5), defaultWidth / 2, defaultHeight, SwingConstants.RIGHT,
				""));

		add(component.addLabel(lblO, "% O", getCol(4), getRow(5), defaultWidth / 2, defaultHeight, SwingConstants.RIGHT,
				""));

		add(component.addLabel(lblCO2, "% CO2", getCol(3), getRow(6), defaultWidth / 2, defaultHeight,
				SwingConstants.RIGHT, ""));

		add(component.addLabel(lblSteam, "% Vapor de Agua", getCol(4), getRow(6), defaultWidth / 2, defaultHeight,
				SwingConstants.RIGHT, ""));

		add(component.addLabel(lblFrozenWater, "Congelado por Agua", getCol(3), getRow(7), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblSalinity, "Salinidad (en gramos)", getCol(3), getRow(8), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblNitrogen, "Congelado por Nitrógeno", getCol(3), getRow(9), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

		add(component.addLabel(lblMethod, "Metodo Congelacion", getCol(3), getRow(10), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		add(component.addLabel(lblExpositionTime, "Tiempo Exposicion", getCol(3), getRow(11), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

	}

	private int getRow(int row) {
		return 60 + ((row - 1) * (defaultHeight + paddingY));
	}

	private int getCol(int col) {
		return 30 + ((col - 1) * (defaultWidth + paddingX));
	}

	public JComboBox<String> getCmbProductType() {
		return cmbProductType;
	}

	public void setCmbProductType(JComboBox<String> cmbProductType) {
		this.cmbProductType = cmbProductType;
	}

	public JComboBox<String> getCmbFrozenType() {
		return cmbFrozenType;
	}

	public void setCmbFrozenType(JComboBox<String> cmbFrozenType) {
		this.cmbFrozenType = cmbFrozenType;
	}

	public JLabel getLblBanner() {
		return lblBanner;
	}

	public void setLblBanner(JLabel lblBanner) {
		this.lblBanner = lblBanner;
	}

	public JLabel getLblBatch() {
		return lblBatch;
	}

	public void setLblBatch(JLabel lblBatch) {
		this.lblBatch = lblBatch;
	}

	public JLabel getLblProductType() {
		return lblProductType;
	}

	public void setLblProductType(JLabel lblProductType) {
		this.lblProductType = lblProductType;
	}

	public JLabel getLblExpirationDate() {
		return lblExpirationDate;
	}

	public void setLblExpirationDate(JLabel lblExpirationDate) {
		this.lblExpirationDate = lblExpirationDate;
	}

	public JLabel getLblPackageDate() {
		return lblPackageDate;
	}

	public void setLblPackageDate(JLabel lblPackageDate) {
		this.lblPackageDate = lblPackageDate;
	}

	public JLabel getLblOriginCountry() {
		return lblOriginCountry;
	}

	public void setLblOriginCountry(JLabel lblOriginCountry) {
		this.lblOriginCountry = lblOriginCountry;
	}

	public JLabel getLblRegrigerated() {
		return lblRegrigerated;
	}

	public void setLblRegrigerated(JLabel lblRegrigerated) {
		this.lblRegrigerated = lblRegrigerated;
	}

	public JLabel getLblSupervisionCode() {
		return lblSupervisionCode;
	}

	public void setLblSupervisionCode(JLabel lblSupervisionCode) {
		this.lblSupervisionCode = lblSupervisionCode;
	}

	public JLabel getLblTemperatureR() {
		return lblTemperatureR;
	}

	public void setLblTemperatureR(JLabel lblTemperatureR) {
		this.lblTemperatureR = lblTemperatureR;
	}

	public JLabel getLblFrozen() {
		return lblFrozen;
	}

	public void setLblFrozen(JLabel lblFrozen) {
		this.lblFrozen = lblFrozen;
	}

	public JLabel getLblTemperatureC() {
		return lblTemperatureC;
	}

	public void setLblTemperatureC(JLabel lblTemperatureC) {
		this.lblTemperatureC = lblTemperatureC;
	}

	public JLabel getLblFrozenType() {
		return lblFrozenType;
	}

	public void setLblFrozenType(JLabel lblFrozenType) {
		this.lblFrozenType = lblFrozenType;
	}

	public JLabel getLblFrozenAir() {
		return lblFrozenAir;
	}

	public void setLblFrozenAir(JLabel lblFrozenAir) {
		this.lblFrozenAir = lblFrozenAir;
	}

	public JLabel getLblN() {
		return lblN;
	}

	public void setLblN(JLabel lblN) {
		this.lblN = lblN;
	}

	public JLabel getLblO() {
		return lblO;
	}

	public void setLblO(JLabel lblO) {
		this.lblO = lblO;
	}

	public JLabel getLblCO2() {
		return lblCO2;
	}

	public void setLblCO2(JLabel lblCO2) {
		this.lblCO2 = lblCO2;
	}

	public JLabel getLblSteam() {
		return lblSteam;
	}

	public void setLblSteam(JLabel lblSteam) {
		this.lblSteam = lblSteam;
	}

	public JLabel getLblFrozenWater() {
		return lblFrozenWater;
	}

	public void setLblFrozenWater(JLabel lblFrozenWater) {
		this.lblFrozenWater = lblFrozenWater;
	}

	public JLabel getLblSalinity() {
		return lblSalinity;
	}

	public void setLblSalinity(JLabel lblSalinity) {
		this.lblSalinity = lblSalinity;
	}

	public JLabel getLblNitrogen() {
		return lblNitrogen;
	}

	public void setLblNitrogen(JLabel lblNitrogen) {
		this.lblNitrogen = lblNitrogen;
	}

	public JLabel getLblMethod() {
		return lblMethod;
	}

	public void setLblMethod(JLabel lblMethod) {
		this.lblMethod = lblMethod;
	}

	public JLabel getLblExpositionTime() {
		return lblExpositionTime;
	}

	public void setLblExpositionTime(JLabel lblExpositionTime) {
		this.lblExpositionTime = lblExpositionTime;
	}

	public JTextField getTxtBanner() {
		return txtBanner;
	}

	public void setTxtBanner(JTextField txtBanner) {
		this.txtBanner = txtBanner;
	}

	public JTextField getTxtBatch() {
		return txtBatch;
	}

	public void setTxtBatch(JTextField txtBatch) {
		this.txtBatch = txtBatch;
	}

	public JTextField getTxtExpirationDate() {
		return txtExpirationDate;
	}

	public void setTxtExpirationDate(JTextField txtExpirationDate) {
		this.txtExpirationDate = txtExpirationDate;
	}

	public JTextField getTxtPackageDate() {
		return txtPackageDate;
	}

	public void setTxtPackageDate(JTextField txtPackageDate) {
		this.txtPackageDate = txtPackageDate;
	}

	public JTextField getTxtOriginCountry() {
		return txtOriginCountry;
	}

	public void setTxtOriginCountry(JTextField txtOriginCountry) {
		this.txtOriginCountry = txtOriginCountry;
	}

	public JTextField getTxtSupervisionCode() {
		return txtSupervisionCode;
	}

	public void setTxtSupervisionCode(JTextField txtSupervisionCode) {
		this.txtSupervisionCode = txtSupervisionCode;
	}

	public JTextField getTxtTemperatureR() {
		return txtTemperatureR;
	}

	public void setTxtTemperatureR(JTextField txtTemperatureR) {
		this.txtTemperatureR = txtTemperatureR;
	}

	public JTextField getTxtTemperatureC() {
		return txtTemperatureC;
	}

	public void setTxtTemperatureC(JTextField txtTemperatureC) {
		this.txtTemperatureC = txtTemperatureC;
	}

	public JTextField getTxtN() {
		return txtN;
	}

	public void setTxtN(JTextField txtN) {
		this.txtN = txtN;
	}

	public JTextField getTxtO() {
		return txtO;
	}

	public void setTxtO(JTextField txtO) {
		this.txtO = txtO;
	}

	public JTextField getTxtCO2() {
		return txtCO2;
	}

	public void setTxtCO2(JTextField txtCO2) {
		this.txtCO2 = txtCO2;
	}

	public JTextField getTxtSteam() {
		return txtSteam;
	}

	public void setTxtSteam(JTextField txtSteam) {
		this.txtSteam = txtSteam;
	}

	public JTextField getTxtSalinity() {
		return txtSalinity;
	}

	public void setTxtSalinity(JTextField txtSalinity) {
		this.txtSalinity = txtSalinity;
	}

	public JTextField getTxtMethod() {
		return txtMethod;
	}

	public void setTxtMethod(JTextField txtMethod) {
		this.txtMethod = txtMethod;
	}

	public JTextField getTxtExpositionTime() {
		return txtExpositionTime;
	}

	public void setTxtExpositionTime(JTextField txtExpositionTime) {
		this.txtExpositionTime = txtExpositionTime;
	}

	public JButton getBtnReturn() {
		return btnReturn;
	}

	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}

	public JButton getBtnSaveProduct() {
		return btnSaveProduct;
	}

	public void setBtnSaveProduct(JButton btnSaveProduct) {
		this.btnSaveProduct = btnSaveProduct;
	}

	public Components getComponent() {
		return component;
	}

	public void setComponent(Components component) {
		this.component = component;
	}

	public void setController(Controller controller) {
		this.setController = controller;

	}
}
