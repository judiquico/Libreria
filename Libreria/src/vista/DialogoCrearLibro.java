package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.Genero;

public class DialogoCrearLibro  extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel_1;
	private JButton btnAñadir;
	private JButton btnCancelar;
	
	public DialogoCrearLibro(Controlador controlador) {
		setResizable(false);
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle(ConstantesVista.TITULO_DIALOGO_ADMINISTRADOR);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoAdministrador.class.getResource("/imagenes/iconoAdministrador.png")));
		setSize(800, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombreLibro = new JLabel("Libro");
		lblNombreLibro.setBounds(44, 22, 82, 14);
		panel.add(lblNombreLibro);
		
		textField = new JTextField();
		textField.setBounds(136, 19, 201, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Autor");
		label.setBounds(44, 66, 54, 14);
		panel.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 63, 201, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(44, 153, 67, 14);
		panel.add(lblCategoria);
		
		JComboBox<Genero> comboBox = new JComboBox<Genero>();
		comboBox.setModel(new DefaultComboBoxModel<Genero>(Genero.values()));
		comboBox.setBounds(136, 147, 210, 20);
		panel.add(comboBox);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(44, 252, 82, 14);
		panel.add(lblDescripcion);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(136, 247, 201, 47);
		panel.add(textArea);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(44, 109, 46, 14);
		panel.add(lblId);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(136, 106, 210, 20);
		panel.add(spinner);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(52, 203, 46, 14);
		panel.add(lblValor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 200, 201, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		this.panel_1 = new JPanel();
		this.panel_1.setBackground(new Color(204, 204, 255));
		this.panel_1.setBounds(0, 324, 450, 47);
		panel.add(this.panel_1);
		this.panel_1.setLayout(null);
		
		this.btnAñadir = new JButton(ConstantesVista.BTN_CONFIRMAR_NUEVO_LIBRO);
		btnAñadir.addActionListener(controlador);
		btnAñadir.setActionCommand(Controlador.AC_CONFIRM_CREAR_LIBRO);
		this.btnAñadir.setBounds(210, 12, 98, 26);
		this.panel_1.add(this.btnAñadir);
		
		this.btnCancelar = new JButton(ConstantesVista.BTN_CANCELAR_DIALOGO);
		btnCancelar.addActionListener(controlador);
		btnCancelar.setActionCommand(Controlador.AC_BTN_CANCELAR_DIALOGO);
		this.btnCancelar.setBounds(320, 12, 98, 26);
		this.panel_1.add(this.btnCancelar);
		

	}
}
