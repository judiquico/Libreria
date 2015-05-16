package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JSpinner;

public class DialogoAdministrador extends JDialog {

	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public DialogoAdministrador() {
		setTitle("Administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoAdministrador.class.getResource("/imagenes/iconoAdministrador.png")));
		setSize(456, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombreLibro = new JLabel("Nombre");
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 147, 28, 20);
		panel.add(comboBox);
		
		JButton btnConfirmar = new JButton("Agregar");
		btnConfirmar.setBounds(341, 327, 89, 23);
		panel.add(btnConfirmar);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(44, 252, 67, 14);
		panel.add(lblDescripcion);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(136, 247, 201, 47);
		panel.add(textArea);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(44, 109, 46, 14);
		panel.add(lblId);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(292, 106, 54, 20);
		panel.add(spinner);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(52, 203, 46, 14);
		panel.add(lblValor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 200, 201, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		

	}
}
