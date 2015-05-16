package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/iconoLibreria.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(ConstantesVista.ANCHO_VENTANA, ConstantesVista.ALTO_VENTANA);
		setResizable(true);
		setTitle(ConstantesVista.TITULO);
		getContentPane().setLayout(new BorderLayout());

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu(ConstantesVista.T_MENU_ARCHIVO);
		menuBar.add(mnArchivo);

		JMenuItem mntmNuevaBusqueda = new JMenuItem(ConstantesVista.T_MENU_ITEM_BUSQUEDA);
		mnArchivo.add(mntmNuevaBusqueda);
		
		JMenuItem mntmImportar = new JMenuItem("Importar");
		mnArchivo.add(mntmImportar);
		
		JMenuItem mntmExportar = new JMenuItem("Exportar");
		mnArchivo.add(mntmExportar);
		
		JMenuItem mntmSalir = new JMenuItem(ConstantesVista.T_MENU_ITEM_SALIR);
		mnArchivo.add(mntmSalir);

		JMenu mnOpciones = new JMenu(ConstantesVista.T_MENU_OPCIONES);
		menuBar.add(mnOpciones);
		
		JMenuItem mntmIdioma = new JMenuItem(ConstantesVista.T_MENU_ITEM_IDIOMA);
		mnOpciones.add(mntmIdioma);
		
		JMenuItem mntmTema = new JMenuItem("Tema");
		mnOpciones.add(mntmTema);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mnAyuda.add(mntmAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de ");
		mnAyuda.add(mntmAcercaDe);
	}

}
