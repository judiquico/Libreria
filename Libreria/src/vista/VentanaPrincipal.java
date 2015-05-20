package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JButton;

import controlador.Controlador;

import java.awt.Color;

import javax.swing.ImageIcon;


public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private ImageIcon backgorund;
	private JLabel lblImagen;
	private Controlador controlador;
	private JMenuItem itemImportar ;
	private JMenuItem itemExportar ;
	private JMenuItem itemSalir ;
	private JMenuBar menuBar ;
	private JMenu mnArchivo ;
	private JMenu mnOpciones ;
	private JMenu itemIdioma ;
	private JMenuItem itemEspanol ;
	private JMenuItem itemIngles ;
	private JMenu mnAyuda;
	private JMenuItem itemAcercaDe ;
	private JPanel panel ;
	private JButton btnUsuario ;
	private JButton btnAdministrador ;
	
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/iconoLibreria.png")));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 375);
		setResizable(false);
		setTitle(ConstantesVista.TITULO);
		setLocationRelativeTo(null);
		controlador = new Controlador();

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu();
		menuBar.add(mnArchivo);

		itemImportar = new JMenuItem();
		mnArchivo.add(itemImportar);
		
		itemExportar = new JMenuItem();
		mnArchivo.add(itemExportar);

		itemSalir = new JMenuItem();
		mnArchivo.add(itemSalir);

		mnOpciones = new JMenu();
		menuBar.add(mnOpciones);

		itemIdioma = new JMenu();
		mnOpciones.add(itemIdioma);
		
		itemEspanol = new JMenuItem();
		itemEspanol.addActionListener(controlador);
		itemEspanol.setActionCommand(Controlador.AC_BTN_CAMBIAR_A_ESPAÑOL);
		itemIdioma.add(itemEspanol);
		
		itemIngles = new JMenuItem();
		itemIdioma.add(itemIngles);

		mnAyuda = new JMenu();
		menuBar.add(mnAyuda);

		itemAcercaDe = new JMenuItem();
		mnAyuda.add(itemAcercaDe);

		panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		getContentPane().add(panel, BorderLayout.NORTH);

		btnUsuario = new JButton();
		btnUsuario.setBackground(new Color(204, 204, 255));
		btnUsuario.addActionListener(controlador);
		btnUsuario.setActionCommand(Controlador.AC_BTN_USUARIO);
		btnUsuario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/iconoUsuario.png")));
		panel.add(btnUsuario);

		btnAdministrador = new JButton();
		btnAdministrador.setBackground(new Color(255, 204, 204));
		btnAdministrador.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/iconoAdministrador.png")));
		btnAdministrador.addActionListener(controlador);
		btnAdministrador.setActionCommand(Controlador.AC_BTN_ADMINISTRADOR);
		panel.add(btnAdministrador);

		JPanel panelImagen = new JPanel();
		getContentPane().add(panelImagen, BorderLayout.CENTER);
		panelImagen.setLayout(null);

		lblImagen = new JLabel();
		this.lblImagen.setLocation(0, 0);
		this.lblImagen.setSize(584, 263);
		lblImagen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/libros.jpg")));
		panelImagen.add(lblImagen);

	}

	public ImageIcon getBackgorund() {
		return backgorund;
	}

	public void setBackgorund(ImageIcon backgorund) {
		this.backgorund = backgorund;
	}

	public void  init() {
		this.setTitle(ConstantesVista.TITULO);
		itemImportar.setText(ConstantesVista.T_MENU_ITEM_IMPORTAR);
		itemExportar.setText(ConstantesVista.T_MENU_ITEM_EXPORTAR);
		itemSalir.setText(ConstantesVista.T_MENU_ITEM_SALIR);
		mnArchivo.setText(ConstantesVista.T_MENU_ARCHIVO);
		mnOpciones.setText(ConstantesVista.T_MENU_OPCIONES);
		itemIdioma.setText(ConstantesVista.T_MENU_ITEM_IDIOMA);
		itemEspanol.setText(ConstantesVista.T_MENU_ITEM_ESPAÑOL);
		itemIngles.setText(ConstantesVista.T_MENU_ITEM_INGLES);
		itemAcercaDe.setText(ConstantesVista.T_MENU_ITEM_ACERCA_DE);
		btnUsuario.setText(ConstantesVista.BTN_USUARIO);
		btnAdministrador.setText(ConstantesVista.BTN_ADMINISTRADOR);
	}
}
