package vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.Controlador;

public class DialogoLoginUsuario extends JDialog {

	/**
	 * @author Ruth Rojas
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labelEncabezado;
	private JButton btnIngresar;
	private JButton btnCancelar;
	private JPanel panelBotones;
	private JLabel labelNombre;
	private JLabel labelContraseña;
	private JTextField textFielNombre;
	private JPasswordField textFielContraseña;
	private JPanel panelCampos;

	public DialogoLoginUsuario(Controlador controlador) {
		this.setSize(ConstantesVista.ANCHO_DIALOGO,
				ConstantesVista.ALTO_IDALOGO);

		GridBagConstraints gb = new GridBagConstraints();
		gb.fill = GridBagConstraints.BOTH;
		gb.insets = new Insets(1, 2, 5, 5);

		labelEncabezado = new JLabel();
		add(labelEncabezado);
		
		panelCampos = new JPanel();
		gb.gridx = 0;
		gb.gridy = 4;
		panelCampos.setLayout(new GridBagLayout());

		labelNombre = new JLabel();
		gb.gridx = 0;
		gb.gridy = 1;
		panelCampos.add(labelNombre);

		textFielNombre = new JTextField(20);
		gb.gridx = 1;
		gb.gridy = 0;
		panelCampos.add(textFielNombre, gb);


		labelContraseña = new JLabel();
		gb.gridx = 0;
		gb.gridy = 1;
		panelCampos.add(labelContraseña, gb);

		textFielContraseña = new JPasswordField(20);
		gb.gridx = 1;
		gb.gridy = 1;
		panelCampos.add(textFielContraseña, gb);

		add(panelCampos);

		btnIngresar = new JButton();
		btnIngresar.addActionListener(controlador);
		btnIngresar.setActionCommand(Controlador.AC_BTN_VERIFICAR_Y_ENTRAR_POR_USUARIO);

		btnCancelar = new JButton();
		btnCancelar.addActionListener(controlador);
		btnCancelar.setActionCommand(Controlador.AC_BTN_CANCELAR_DIALOGO);

		panelBotones = new JPanel();
		panelBotones.add(btnIngresar);
		panelBotones.add(btnCancelar);
		add(panelBotones, BorderLayout.SOUTH);
		initDCU();
	}

	public void initDCU() {
		this.setTitle(ConstantesVista.TITULO_DIALOGO_LOGIN_USER_INICIAL);
		btnIngresar.setText(ConstantesVista.BTN_INGRESAR_USUARIO);
		btnCancelar.setText(ConstantesVista.BTN_CANCELAR);
		labelNombre.setText(ConstantesVista.LABEL_NOMBRE_REGISTRO_USUARIO);
		labelContraseña.setText(ConstantesVista.LABEL_CONSTRASEÑA_REGISTRO_CONTRASEÑA);
		labelEncabezado.setText(ConstantesVista.LABEL_ENCABEZADO_LOGIN_USER);
	}

	public JTextField getTextFielNombre() {
		return textFielNombre;
	}

	public void setTextFielNombre(JTextField textFielNombre) {
		this.textFielNombre = textFielNombre;
	}

	public JPasswordField getTextFielContraseña() {
		return textFielContraseña;
	}

	public void setTextFielContraseña(JPasswordField textFielContraseña) {
		this.textFielContraseña = textFielContraseña;
	}
	

}
