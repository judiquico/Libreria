package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JButton;

import controlador.Controlador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;

	public VentanaPrincipal(Controlador controlador) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				VentanaPrincipal.class
						.getResource("/imagenes/iconoLibreria.png")));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(ConstantesVista.ANCHO_VENTANA, ConstantesVista.ALTO_VENTANA);
		setResizable(true);
		setTitle(ConstantesVista.TITULO);
		setLocationRelativeTo(null);

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

		JButton btnUsuario = new JButton("Usuario");
		btnUsuario.setBackground(new Color(204, 204, 255));
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUsuario.setIcon(new ImageIcon(VentanaPrincipal.class
				.getResource("/imagenes/iconoUsuario.png")));
		panel.add(btnUsuario);

		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.setBackground(new Color(255, 204, 204));
		btnAdministrador.setIcon(new ImageIcon(VentanaPrincipal.class
				.getResource("/imagenes/iconoAdministrador.png")));
		panel.add(btnAdministrador);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));

		this.table = new JTable();
		this.table.setBackground(new Color(255, 255, 204));
		this.table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Libro", "Autor", "Categoria",
						"Descripcion", "Valor" }));
		panel_1.add(this.table);
	}
}
