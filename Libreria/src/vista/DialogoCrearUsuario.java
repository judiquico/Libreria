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
import javax.swing.JTextPane;

import controlador.Controlador;

public class DialogoCrearUsuario extends JDialog {

	/**
	 * @author Ruth Rojas
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCrearUsuario;
	private JButton btnCancelar;
	private JPanel panelBotones;
	private JLabel labelNombre;
	private JLabel labelContrase�a;
	private JTextField textFielNombre;
	private JPasswordField textFielContrase�a;
	private JPanel panelCampos;

	public DialogoCrearUsuario(Controlador controlador) {

		this.setSize(ConstantesVista.ANCHO_DIALOGO,
				ConstantesVista.ALTO_IDALOGO);

		GridBagConstraints gb = new GridBagConstraints();
		gb.fill = GridBagConstraints.BOTH;
		gb.insets = new Insets(1, 2, 5, 5);
		
		panelCampos = new JPanel();
		panelCampos.setLayout(new GridBagLayout());
		
		labelNombre = new JLabel();
		gb.gridx = 0;
		gb.gridy = 0;
		panelCampos.add(labelNombre);
		
		textFielNombre = new JTextField(20);
		gb.gridx = 1;
		gb.gridy = 0;
		panelCampos.add(textFielNombre, gb);
		

		labelContrase�a = new JLabel();
		gb.gridx = 0;
		gb.gridy = 1;
		panelCampos.add(labelContrase�a, gb);

		textFielContrase�a = new JPasswordField(20);
		gb.gridx = 1;
		gb.gridy = 1;
		panelCampos.add(textFielContrase�a, gb);

		add(panelCampos);

		btnCrearUsuario = new JButton();
		btnCrearUsuario.addActionListener(controlador);
		btnCrearUsuario.setActionCommand(Controlador.AC_BTN_CREAR_USUARIO);

		btnCancelar = new JButton();
		btnCancelar.addActionListener(controlador);
		btnCancelar.setActionCommand(Controlador.AC_BTN_CANCELAR_DIALOGO);

		panelBotones = new JPanel();
		panelBotones.add(btnCrearUsuario);
		panelBotones.add(btnCancelar);
		add(panelBotones, BorderLayout.SOUTH);
		initDCU();
	}

	public void initDCU() {
		this.setTitle(ConstantesVista.TITULO_DIALOGO_LOGIN_USER);
		btnCrearUsuario.setText(ConstantesVista.BTN_CREAR_NUEVO_USUARIO);
		btnCancelar.setText(ConstantesVista.BTN_CANCELAR);
		labelNombre.setText(ConstantesVista.LABEL_NOMBRE_REGISTRO_USUARIO);
		labelContrase�a.setText(ConstantesVista.LABEL_CONSTRASE�A_REGISTRO_CONTRASE�A);
	}

}
