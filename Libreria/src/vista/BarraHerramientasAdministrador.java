package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import controlador.Controlador;

public class BarraHerramientasAdministrador extends JToolBar {

	/**
	 * @author Ruth Rojas 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCrearLibro;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnEditar;
	private JLabel labelBuscar;
	private JTextField textBuscar;
	private JRadioButton radioBuscarTitulo;
	private JRadioButton radioAutor;
	private JRadioButton radioId;
	private ButtonGroup grupoBuscar;
	private JButton btnBuscar;
	
	public BarraHerramientasAdministrador(Controlador controlador) {
		btnCrearLibro = new JButton(ConstantesVista.BTN_CREAR_NUEVO_LIBRO);
		btnCrearLibro.addActionListener(controlador);
		btnCrearLibro.setActionCommand(Controlador.AC_MOSTRAR_DIALOGO_CREAR_LIBRO);
		add(btnCrearLibro);
		btnActualizar = new JButton(ConstantesVista.BTN_ACTUALIZAR_LIBRO);
		add(btnActualizar);
		btnEditar = new JButton(ConstantesVista.BTN_EDITAR_LIBRO);
		add(btnEditar);
		btnEliminar = new JButton(ConstantesVista.BTN_ELIMINAR_LIBRO);
		add(btnEliminar);
		addSeparator();
		labelBuscar = new JLabel(ConstantesVista.LBL_BUSCAR_LIBRO);
		add(labelBuscar);
		radioId = new JRadioButton(ConstantesVista.RADIO_BUSCAR_ID);
		add(radioId);
		grupoBuscar = new ButtonGroup();
		grupoBuscar.add(radioId);
		radioBuscarTitulo = new JRadioButton(ConstantesVista.RADIO_BUSCAR_TITULO);
		add(radioBuscarTitulo);
		grupoBuscar.add(radioBuscarTitulo);
		radioAutor = new JRadioButton(ConstantesVista.RADIO_BUSCAR_AUTOR);
		add(radioAutor);
		grupoBuscar.add(radioAutor);
		textBuscar = new JTextField();
		add(textBuscar);
		btnBuscar = new JButton(ConstantesVista.BTN_BUSCAR_LIBRO);
		add(btnBuscar);
	}
	
}
