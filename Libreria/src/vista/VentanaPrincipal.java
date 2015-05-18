package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import controlador.Controlador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaPrincipal(Controlador controlador) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/iconoLibreria.png")));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(ConstantesVista.ANCHO_VENTANA, ConstantesVista.ALTO_VENTANA);
		setResizable(true);
		setTitle(ConstantesVista.TITULO);
		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu(ConstantesVista.T_MENU_ARCHIVO);
		menuBar.add(mnArchivo);
		
		JMenuItem mntmImportar = new JMenuItem(ConstantesVista.T_MENU_ITEM_IMPORTAR);
		mnArchivo.add(mntmImportar);
		
		JMenuItem mntmExportar = new JMenuItem(ConstantesVista.T_MENU_ITEM_EXPORTAR);
		mnArchivo.add(mntmExportar);
		
		JMenuItem mntmSalir = new JMenuItem(ConstantesVista.T_MENU_ITEM_SALIR);
		mnArchivo.add(mntmSalir);

		JMenu mnOpciones = new JMenu(ConstantesVista.T_MENU_OPCIONES);
		menuBar.add(mnOpciones);
		
		JMenuItem mntmIdioma = new JMenuItem(ConstantesVista.T_MENU_ITEM_IDIOMA);
		mnOpciones.add(mntmIdioma);
		
		JMenuItem mntmTema = new JMenuItem(ConstantesVista.T_MENU_ITEM_TEMA);
		mnOpciones.add(mntmTema);
		
		JMenu mnAyuda = new JMenu(ConstantesVista.T_MENU_AYUDA);
		menuBar.add(mnAyuda);
		
		
		JMenuItem mntmAcercaDe = new JMenuItem(ConstantesVista.T_MENU_ITEM_ACERCA_DE);
		mnAyuda.add(mntmAcercaDe);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnUsuario = new JButton("Usuario");
		panel.add(btnUsuario);
		
		JButton btnAdministrador = new JButton("Administrador");
		panel.add(btnAdministrador);
		
		JButton btnEstadisticas = new JButton("Estadisticas");
		panel.add(btnEstadisticas);
	}
}
