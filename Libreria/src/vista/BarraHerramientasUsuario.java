package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientasUsuario extends JToolBar {

	/**
	 * @author Ruth Rojas
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnComprar;
	private JLabel labelBuscar;
	private JTextField textBuscar;
	private JRadioButton radioBuscarTitulo;
	private JRadioButton radioAutor;
	private ButtonGroup grupoBuscar;
	private JButton btnBuscar;

	public BarraHerramientasUsuario(Controlador controlador) {
		addSeparator();
		labelBuscar = new JLabel(ConstantesVista.LBL_BUSCAR_LIBRO);
		add(labelBuscar);
		grupoBuscar = new ButtonGroup();
		
		radioBuscarTitulo = new JRadioButton(ConstantesVista.RADIO_BUSCAR_TITULO);
		radioBuscarTitulo.addActionListener(controlador);
		radioBuscarTitulo.setActionCommand(Controlador.AC_RDBTN_BUSCAR_TITULO_ADMINSTRADOR);
		add(radioBuscarTitulo);
		grupoBuscar.add(radioBuscarTitulo);
		
		radioAutor = new JRadioButton(ConstantesVista.RADIO_BUSCAR_AUTOR);
		radioAutor.addActionListener(controlador);
		radioAutor.setActionCommand(Controlador.AC_RDBTN_BUSCAR_AUTOR_ADMNISTRADOR);
		add(radioAutor);
		grupoBuscar.add(radioAutor);
		
		textBuscar = new JTextField();
		add(textBuscar);
		btnBuscar = new JButton(ConstantesVista.BTN_BUSCAR_LIBRO);
		add(btnBuscar);
		addSeparator();
		btnComprar = new JButton("comprar");
		add(btnComprar);
	}

}
