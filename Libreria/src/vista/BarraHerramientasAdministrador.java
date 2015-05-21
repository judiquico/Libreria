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
	private JButton btnMostrarDialogoCrearUsuario;
	
	public BarraHerramientasAdministrador(Controlador controlador) {
		btnCrearLibro = new JButton();
		btnCrearLibro.addActionListener(controlador);
		btnCrearLibro.setActionCommand(Controlador.AC_MOSTRAR_DIALOGO_CREAR_LIBRO);
		add(btnCrearLibro);
		
		btnMostrarDialogoCrearUsuario = new JButton();
		btnMostrarDialogoCrearUsuario.addActionListener(controlador);
		btnMostrarDialogoCrearUsuario.setActionCommand(Controlador.AC_BTN_MOSTRAR_DIALOGO_CREAR_USUARIO);
		add(btnMostrarDialogoCrearUsuario);
		
		btnActualizar = new JButton();
		add(btnActualizar);
		btnEditar = new JButton();
		add(btnEditar);
		
		btnEliminar = new JButton();
		btnEliminar.addActionListener(controlador);
		btnEliminar.setActionCommand(Controlador.AC_BTN_ELIMINAR_LIBRO);
		add(btnEliminar);
		
		addSeparator();
		labelBuscar = new JLabel();
		add(labelBuscar);
		
		radioId = new JRadioButton();
		radioId.addActionListener(controlador);
		radioId.setActionCommand(Controlador.AC_RDBTN_BUSCAR_ID_ADMIISTRADOR);
		add(radioId);
		grupoBuscar = new ButtonGroup();
		grupoBuscar.add(radioId);
		
		radioBuscarTitulo = new JRadioButton();
		radioBuscarTitulo.addActionListener(controlador);
		radioBuscarTitulo.setActionCommand(Controlador.AC_RDBTN_USCAR_TITULO_ADMINSTRADOR);
		add(radioBuscarTitulo);
		grupoBuscar.add(radioBuscarTitulo);
		
		radioAutor = new JRadioButton();
		radioAutor.addActionListener(controlador);
		radioAutor.setActionCommand(Controlador.AC_RDBTN_BUSCAR_AUTOR_ADMNISTRADOR);
		add(radioAutor);
		grupoBuscar.add(radioAutor);
		textBuscar = new JTextField();
		add(textBuscar);
		btnBuscar = new JButton();
		add(btnBuscar);
	}
	public void init(){
		btnCrearLibro.setText(ConstantesVista.BTN_CREAR_NUEVO_LIBRO);
		btnMostrarDialogoCrearUsuario.setText(ConstantesVista.BTN_MOSTRAR_DIALOGO_CREAR_NUEVO_USUARIO);
		btnActualizar.setText(ConstantesVista.BTN_ACTUALIZAR_LIBRO);
		btnEditar.setText(ConstantesVista.BTN_EDITAR_LIBRO);
		btnEliminar.setText(ConstantesVista.BTN_ELIMINAR_LIBRO);
		labelBuscar.setText(ConstantesVista.LBL_BUSCAR_LIBRO);
		radioId.setText(ConstantesVista.RADIO_BUSCAR_ID);
		radioBuscarTitulo.setText(ConstantesVista.RADIO_BUSCAR_TITULO);
		radioAutor.setText(ConstantesVista.RADIO_BUSCAR_AUTOR);
		btnBuscar.setText(ConstantesVista.BTN_BUSCAR_LIBRO);
	}

	public JTextField getTextBuscar() {
		return textBuscar;
	}

	public void setTextBuscar(JTextField textBuscar) {
		this.textBuscar = textBuscar;
	}
	
}
