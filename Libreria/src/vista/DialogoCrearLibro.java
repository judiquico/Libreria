package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import controlador.Controlador;
import modelo.dao.GestorLibros;
import modelo.entidades.Genero;
import modelo.entidades.Libro;
import modelo.util.Util;

public class DialogoCrearLibro  extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldValor;
	private JTextField textFieldId;
	private JPanel panel_1;
	private JButton btnAniadir;
	private JButton btnSubirImagen;
	private JButton btnCancelar;
	private JLabel lblId ;
	private JLabel lblTituloLibro;
	private JLabel labelAutor ;
	private JLabel lblCategoria ;
	private JLabel lblDescripcion ;
	private JLabel lblValor;
	private JFileChooser fileChooser;
	JComboBox<Genero> comboBox ;
	JTextArea textAreaDescripcion; 
	private File file;
	private File archivoLibro;
	
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
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(0, 324, 450, 47);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnSubirImagen = new JButton("subir");
		btnSubirImagen.setBounds(410, 120, 98, 26);
		btnSubirImagen.addActionListener(controlador);
		btnSubirImagen.setActionCommand(Controlador.A_MOSTRAR_SUBIR_IMAGEN);
		panel.add(btnSubirImagen);
		
		btnAniadir = new JButton();
		btnAniadir.addActionListener(controlador);
		btnAniadir.setActionCommand(Controlador.AC_CREAR_LIBRO);
		btnAniadir.setBounds(210, 12, 98, 26);
		panel_1.add(btnAniadir);
		
		btnCancelar = new JButton();
		btnCancelar.addActionListener(controlador);
		btnCancelar.setActionCommand(Controlador.AC_BTN_CANCELAR_DIALOGO);
		btnCancelar.setBounds(320, 12, 98, 26);
		panel_1.add(btnCancelar);
		init();
	}
	
	public void limpiarFormulario(){
		textFieldId.setText("");
		textFieldTitulo.setText("");
		textFieldAutor.setText("");
		textFieldValor.setText("");
		textAreaDescripcion.setText("");
	}
	
	public void fileCopy(String sourceFile, String destinationFile) {
		try {
			File inFile = new File(sourceFile);
			File outFile = new File(destinationFile);

			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);

			int c;
			while( (c = in.read() ) != -1)
				out.write(c);

			in.close();
			out.close();
		} catch(IOException e) {
			System.err.println("Hubo un error de entrada/salida!!!");
		}
	}

	public Libro crearLibro(){
		String extensionFile = Util.getFileExtension(fileChooser.getSelectedFile());
		String rutaDestino = "src/libros/"+ textFieldTitulo.getText()+ "." + extensionFile;
		fileCopy(fileChooser.getSelectedFile().getPath(), rutaDestino);
		Libro libro = GestorLibros.crearLibro(textFieldTitulo.getText(), textAreaDescripcion.getText(), textFieldValor.getText()
				, comboBox.getSelectedItem().toString(), textFieldAutor.getText(), rutaDestino);
		dispose();
		return libro;		 
	}
	
	public File cargarLibro(){
		fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
		fileChooser.showOpenDialog(null);
		file = fileChooser.getSelectedFile();
		if(file != null){
			archivoLibro= new File(file.getPath());
		}
		return archivoLibro;		
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