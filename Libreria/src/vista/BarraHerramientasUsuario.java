package vista;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class BarraHerramientasUsuario extends JToolBar {

	/**
	 * @author Ruth Rojas
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnComprar;

	public BarraHerramientasUsuario() {
		btnComprar = new JButton("comprar");
		add(btnComprar);
	}

}
