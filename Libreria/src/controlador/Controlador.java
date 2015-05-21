package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.Libro;
import modelo.dao.GestorLibros;
import vista.DialogoAdministrador;
import vista.DialogoCrearLibro;
import vista.DialogoUsuario;
import vista.PanelTable;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener, ListSelectionListener {

	public static final String AC_BTN_USUARIO = "BOTON ENTRAR POR USUARIO";
	public static final String AC_BTN_ADMINISTRADOR = "BOTON ENTRAR POR ADMINISTRADOR";
	public static final String AC_BTN_COMPRAR_LIBRO = "ACCION COMPRAR LIBRO";
	public static final String AC_MOSTRAR_DIALOGO_CREAR_LIBRO = "DIALOGO CREAR NUEVO LIBRO";
	public static final String AC_CONFIRM_CREAR_LIBRO = "CREAR EL NUEVO LIBRO";
	public static final String AC_BTN_CANCELAR_DIALOGO = "CERRAR EL DIALOGO";
	public static final String AC_BTN_CONFIRMAR_USUARIO = "CONFIRMAR USUARIO";
	public static final String AC_RDBTN_BUSCAR_ID_ADMIISTRADOR = "BUSCAR POR ID ADMINISTRADOR";
	public static final String AC_RDBTN_USCAR_TITULO_ADMINSTRADOR = "BUSCAR POR TITULO EN ADMINISTRADOR";
	public static final String AC_RDBTN_BUSCAR_AUTOR_ADMNISTRADOR = "BUSCAR POR AUTOR EN ADMNISTRADOR";
	public static final String AC_BTN_ELIMINAR_LIBRO = "ELIMINAR LIBRO";
	public static final String AC_BTN_CAMBIAR_A_ESPANIOL = "CAMBIAR IDIOMA A ESPANOL";
	public static final String AC_BTN_CAMBIAR_A_INGLES = "CAMBIAR IDIOMA A INGLES";
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	private DialogoCrearLibro dialogoCrearLibro;
	private GestorLibros gestor;
	private PanelTable panelTable;
	private Properties properties;

	public Controlador() {
		dialogoAdministrador = new DialogoAdministrador(this);
		dialogoUsuario = new DialogoUsuario(this);
		dialogoCrearLibro = new DialogoCrearLibro(this);
		panelTable = new PanelTable(this);
		gestor = new GestorLibros();
		properties = new Properties();
		cargarProperties("archivos_properties/ingles.properties");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case AC_BTN_USUARIO:
			dialogoUsuario.setVisible(true);
			break;
		case AC_BTN_ADMINISTRADOR:
			dialogoAdministrador.setVisible(true);
			break;
		case AC_MOSTRAR_DIALOGO_CREAR_LIBRO:
			dialogoCrearLibro.setVisible(true);
			break;
		case AC_CONFIRM_CREAR_LIBRO:
			agregarNuevoLibro();
			dialogoCrearLibro.limpiarFormulario();
			break;
		case AC_BTN_CANCELAR_DIALOGO:
			dialogoCrearLibro.dispose();
		case AC_BTN_CONFIRMAR_USUARIO:
			dialogoUsuario.dispose();
			break;
		case AC_RDBTN_BUSCAR_ID_ADMIISTRADOR:
			System.out.println("ID");
			panelTable.filtrarId();
			break;
		case AC_RDBTN_USCAR_TITULO_ADMINSTRADOR:
			System.out.println("titulo");
			panelTable.filtrarTitulo();
			break;
		case AC_RDBTN_BUSCAR_AUTOR_ADMNISTRADOR:
			System.out.println("autor");
			panelTable.filtroAutor();
			break;
		case AC_BTN_ELIMINAR_LIBRO:
			int confirmacion = JOptionPane.showConfirmDialog(panelTable, "Desea eliminar el registro de este Libro?");
			if (confirmacion == JOptionPane.OK_OPTION) {
				eliminarLibro();
			}
		case AC_BTN_CAMBIAR_A_ESPANIOL:
			actualizarIdiomaEspanol();
		case AC_BTN_CAMBIAR_A_INGLES:
			actualizarIdiomaIngles();
		}
	}
	public void agregarNuevoLibro(){
		Libro libro = dialogoCrearLibro.crearLibro();
		if (libro != null) {
			gestor.agregarLibro(libro);
			panelTable.addLibro(libro);
			dialogoCrearLibro.dispose();
			System.out.println(libro);
		}
	}
	private void actualizarIdiomaEspanol(){
		cargarProperties("/archivos_properties/espanol.properties");
//		ventanaPrincipal.init();
		dialogoAdministrador.init();
		dialogoUsuario.init();
		dialogoCrearLibro.init();
	}
	private void actualizarIdiomaIngles(){
		cargarProperties("archivos_properties/ingles.properties");
//		ventanaPrincipal.init();
		dialogoAdministrador.init();
		dialogoUsuario.init();
		dialogoCrearLibro.init();
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		
	}
	public void eliminarLibro(){
		int id = panelTable.eliminarLibro();
		gestor.borrarLibro(gestor.buscarLibro(id));
	}
	
	public void cargarProperties(String archivo){
		InputStream input = getClass().getClassLoader().getResourceAsStream(archivo);
		if (input != null) {
			try {
				properties.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		VentanaPrincipal vt = new VentanaPrincipal();
		vt.init();
		vt.setVisible(true);
	}
}
