package vista;


import java.awt.BorderLayout;

import javax.swing.JDialog;

import controlador.Controlador;
import java.awt.GridLayout;
import java.awt.Toolkit;

public class DialogoAdministrador extends JDialog {

	private static final long serialVersionUID = 1L;
	private BarraHerramientasAdministrador admin;
	private PanelTable panelTable;
	
		public DialogoAdministrador(Controlador controlador) {
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
