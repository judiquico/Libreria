package vista;


import java.awt.BorderLayout;

import javax.swing.JDialog;

import controlador.Controlador;

public class DialogoAdministrador extends JDialog {

	private static final long serialVersionUID = 1L;
	private BarraHerramientasAdministrador admin;
	
		public DialogoAdministrador(Controlador controlador) {
			setSize(800, 500);
			admin = new BarraHerramientasAdministrador(controlador);
			add(admin, BorderLayout.NORTH);
		}
}
