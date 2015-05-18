package vista;


import java.awt.BorderLayout;

import javax.swing.JDialog;

import controlador.Controlador;

public class DialogoAdministrador extends JDialog {

	private static final long serialVersionUID = 1L;
	private BarraHerramientasAdministrador admin;
	private Controlador controlador;

		public DialogoAdministrador() {
			admin = new BarraHerramientasAdministrador(controlador);
			add(admin, BorderLayout.NORTH);
		}
}
