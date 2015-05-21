package vista;


import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

import java.awt.GridLayout;
import java.awt.Toolkit;

public class DialogoAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private BarraHerramientasAdministrador admin;
	private PanelTable panelTable;
	private MenuLibro menuLibro;
	
		public DialogoAdministrador(Controlador controlador) {
			super();
			menuLibro = new MenuLibro(controlador);
			menuLibro.initMenu();
			this.setJMenuBar(menuLibro);
			setTitle(ConstantesVista.TITULO_DIALOGO_ADMINISTRADOR);
			setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoAdministrador.class.getResource("/imagenes/iconoAdministrador.png")));
			setSize(800, 500);
			admin = new BarraHerramientasAdministrador(controlador);
			panelTable = new PanelTable(controlador);
			getContentPane().add(panelTable, BorderLayout.CENTER);
			this.panelTable.setLayout(new GridLayout(1, 0, 0, 0));
			getContentPane().add(admin, BorderLayout.NORTH);
			init();
		}
		public void init(){
			admin.init();
		}
}
