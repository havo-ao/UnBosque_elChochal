package co.edu.unbosque.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AddModifyView extends JFrame {

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

	private JButton btnReturn = new JButton();
	private JButton btnSaveProduct = new JButton();

	private Components component = new Components();

	final int defaultWidth = 180;
	final int defaultHeight = 30;

	final int paddingX = 10;
	final int paddingY = 10;

	public AddModifyView() {
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
}
