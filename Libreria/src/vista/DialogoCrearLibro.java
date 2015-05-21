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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.Autor;
import modelo.Genero;
import modelo.Libro;
import modelo.dao.GestorLibros;

public class DialogoCrearLibro  extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldValor;
	private JTextField textFieldId;
	private JPanel panel_1;
	private JButton btnAniadir;
	private JButton btnCancelar;
	private JLabel lblId ;
	private JLabel lblTituloLibro;
	private JLabel labelAutor ;
	private JLabel lblCategoria ;
	private JLabel lblDescripcion ;
	private JLabel lblValor;
	JComboBox<Genero> comboBox ;
	JTextArea textAreaDescripcion; 
	
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
		
		lblId = new JLabel();
		lblId.setBounds(44, 109, 46, 14);
		panel.add(lblId);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(136, 106, 210, 20);
		panel.add(textFieldId);
		
		lblTituloLibro = new JLabel();
		lblTituloLibro.setBounds(44, 22, 82, 14);
		panel.add(lblTituloLibro);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(136, 19, 201, 20);
		panel.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		labelAutor = new JLabel();
		labelAutor.setBounds(44, 66, 54, 14);
		panel.add(labelAutor);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(136, 63, 201, 20);
		panel.add(textFieldAutor);
		textFieldAutor.setColumns(10);
		
		lblCategoria = new JLabel();
		lblCategoria.setBounds(44, 153, 67, 14);
		panel.add(lblCategoria);
		
		comboBox = new JComboBox<Genero>();
		comboBox.setModel(new DefaultComboBoxModel<Genero>(Genero.values()));
		comboBox.setBounds(136, 147, 210, 20);
		panel.add(comboBox);
		
		lblDescripcion = new JLabel();
		lblDescripcion.setBounds(44, 252, 82, 14);
		panel.add(lblDescripcion);
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(136, 247, 201, 47);
		panel.add(textAreaDescripcion);
		
		
		lblValor = new JLabel();
		lblValor.setBounds(52, 203, 46, 14);
		panel.add(lblValor);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(136, 200, 201, 20);
		panel.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		this.panel_1 = new JPanel();
		this.panel_1.setBackground(new Color(204, 204, 255));
		this.panel_1.setBounds(0, 324, 450, 47);
		panel.add(this.panel_1);
		this.panel_1.setLayout(null);
		
		this.btnAniadir = new JButton();
		btnAniadir.addActionListener(controlador);
		btnAniadir.setActionCommand(Controlador.AC_CONFIRM_CREAR_LIBRO);
		this.btnAniadir.setBounds(210, 12, 98, 26);
		this.panel_1.add(this.btnAniadir);
		
		this.btnCancelar = new JButton();
		btnCancelar.addActionListener(controlador);
		btnCancelar.setActionCommand(Controlador.AC_BTN_CANCELAR_DIALOGO);
		this.btnCancelar.setBounds(320, 12, 98, 26);
		this.panel_1.add(this.btnCancelar);
		init();
	}
	
	public void limpiarFormulario(){
		textFieldId.setText("");
		textFieldTitulo.setText("");
		textFieldAutor.setText("");
		textFieldValor.setText("");
		textAreaDescripcion.setText("");
	}

	public Libro crearLibro() {
		Libro libro = GestorLibros.crearLibro(textFieldTitulo.getText(),new Autor(textFieldAutor.getText()), textAreaDescripcion.getText(), textFieldValor.getText());
		return libro;	
	}
	public void init(){
		lblId.setText(ConstantesVista.LBL_ID);
		lblTituloLibro.setText(ConstantesVista.LBL_TITULO_LIBRO);
		labelAutor.setText(ConstantesVista.LBL_AUTOR);
		lblCategoria.setText(ConstantesVista.LBL_CATEGORIA);
		lblDescripcion.setText(ConstantesVista.LBL_DESCRIPCION);
		lblValor.setText(ConstantesVista.LBL_VALOR);
		btnAniadir.setText(ConstantesVista.BTN_CONFIRMAR_NUEVO_LIBRO);
		btnCancelar.setText(ConstantesVista.BTN_CANCELAR_DIALOGO);
	}
}
