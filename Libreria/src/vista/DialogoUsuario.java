package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Genero;

public class DialogoUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel panelCentral;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblLibro;
	private JLabel lblAutor;
	private JLabel lblGenero;
	private JComboBox<Genero> comboBox;
	private BarraHerramientasUsuario usuario;
	
	public DialogoUsuario() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				DialogoUsuario.class.getResource("/imagenes/iconoUsuario.png")));
		setResizable(false);
		setBounds(100, 100, 400, 243);
		getContentPane().setLayout(new BorderLayout());
		panelCentral = new JPanel();
		usuario = new BarraHerramientasUsuario();
		add(usuario, BorderLayout.NORTH);
		
		panelCentral.setBackground(new Color(204, 204, 255));
		panelCentral.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.add(panelCentral, BorderLayout.CENTER);
		this.panelCentral.setLayout(null);
		this.textField = new JTextField();
		this.textField.setBounds(124, 73, 203, 20);
		this.panelCentral.add(this.textField);
		this.textField.setColumns(10);

		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		this.textField_1.setBounds(124, 27, 203, 20);
		this.panelCentral.add(this.textField_1);

		this.lblLibro = new JLabel("Libro");
		this.lblLibro.setBounds(40, 27, 46, 17);
		this.panelCentral.add(this.lblLibro);

		this.lblAutor = new JLabel("Autor\r\n");
		this.lblAutor.setBounds(40, 76, 46, 17);
		this.panelCentral.add(this.lblAutor);

		this.lblGenero = new JLabel("Genero");
		this.lblGenero.setBounds(40, 118, 46, 17);
		this.panelCentral.add(this.lblGenero);

		this.comboBox = new JComboBox<Genero>();
		this.comboBox
				.setModel(new DefaultComboBoxModel<Genero>(Genero.values()));
		this.comboBox.setBounds(118, 116, 209, 20);
		this.panelCentral.add(this.comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 204, 204));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Confirmar");
				okButton.setActionCommand("Confirmar");
				buttonPane.add(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancelar");
				buttonPane.add(cancelButton);
			}
		}
	}
}
