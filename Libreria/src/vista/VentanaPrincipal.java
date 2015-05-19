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

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/iconoLibreria.png")));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 375);
		setResizable(false);
		setTitle(ConstantesVista.TITULO);
		setLocationRelativeTo(null);
		
		controlador = new Controlador();

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu(ConstantesVista.T_MENU_ARCHIVO);
		menuBar.add(mnArchivo);

		JMenuItem mntmImportar = new JMenuItem(
				ConstantesVista.T_MENU_ITEM_IMPORTAR);
		mnArchivo.add(mntmImportar);

		JMenuItem mntmExportar = new JMenuItem(
				ConstantesVista.T_MENU_ITEM_EXPORTAR);
		mnArchivo.add(mntmExportar);

		JMenuItem mntmSalir = new JMenuItem(ConstantesVista.T_MENU_ITEM_SALIR);
		mnArchivo.add(mntmSalir);

		JMenu mnOpciones = new JMenu(ConstantesVista.T_MENU_OPCIONES);
		menuBar.add(mnOpciones);

		JMenuItem mntmIdioma = new JMenuItem(ConstantesVista.T_MENU_ITEM_IDIOMA);
		mnOpciones.add(mntmIdioma);

		JMenu mnAyuda = new JMenu(ConstantesVista.T_MENU_AYUDA);
		menuBar.add(mnAyuda);

		JMenuItem mntmAcercaDe = new JMenuItem(
				ConstantesVista.T_MENU_ITEM_ACERCA_DE);
		mnAyuda.add(mntmAcercaDe);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		getContentPane().add(panel, BorderLayout.NORTH);

		JButton btnUsuario = new JButton(ConstantesVista.BTN_USUARIO);
		btnUsuario.setBackground(new Color(204, 204, 255));
		btnUsuario.addActionListener(controlador);
		btnUsuario.setActionCommand(Controlador.AC_BTN_USUARIO);
		btnUsuario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/iconoUsuario.png")));
		panel.add(btnUsuario);

		JButton btnAdministrador = new JButton(ConstantesVista.BTN_ADMINISTRADOR);
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
}
