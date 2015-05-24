package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.dao.GestorLibros;
import modelo.entidades.Libro;
import modelo.excepciones.ExcepcionLibroNoEncontrado;
import vista.DialogoAdministrador;
import vista.DialogoCrearLibro;
import vista.DialogoCrearUsuario;
import vista.DialogoUsuario;
import vista.PanelTable;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener, ListSelectionListener {
	public static final String AC_BTN_USUARIO = "BOTON ENTRAR POR USUARIO";
	public static final String AC_BTN_ADMINISTRADOR = "BOTON ENTRAR POR ADMINISTRADOR";
	public static final String AC_BTN_COMPRAR_LIBRO = "ACCION COMPRAR LIBRO";
	public static final String AC_MOSTRAR_DIALOGO_CREAR_LIBRO = "DIALOGO CREAR NUEVO LIBRO";
	public static final String AC_CREAR_LIBRO = "CREAR EL NUEVO LIBRO";
	public static final String AC_BTN_CANCELAR_DIALOGO = "CERRAR EL DIALOGO";
	public static final String AC_BTN_CONFIRMAR_USUARIO = "CONFIRMAR USUARIO";
	public static final String AC_RDBTN_BUSCAR_ID_ADMINISTRADOR = "BUSCAR POR ID ADMINISTRADOR";
	public static final String AC_RDBTN_BUSCAR_TITULO_ADMINSTRADOR = "BUSCAR POR TITULO EN ADMINISTRADOR";
	public static final String AC_RDBTN_BUSCAR_AUTOR_ADMINISTRADOR = "BUSCAR POR AUTOR EN ADMNISTRADOR";
	public static final String AC_BTN_ELIMINAR_LIBRO = "ELIMINAR LIBRO";
	public static final String AC_BTN_CAMBIAR_A_ESPANIOL = "CAMBIAR IDIOMA A ESPANOL";
	public static final String AC_BTN_CAMBIAR_A_INGLES = "CAMBIAR IDIOMA A INGLES";
	public static final String AC_BTN_MOSTRAR_DIALOGO_CREAR_USUARIO = "MOSTRAR DIALODO CREAR UN USUARIO NUEVO";
	public static final String AC_BTN_CREAR_USUARIO = "CREAR UN NUEVO USUARIO";
	public static final String A_MOSTRAR_SUBIR_IMAGEN = "BTN_SUBIR_IMAGEN";
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	private DialogoCrearLibro dialogoCrearLibro;
	private GestorLibros gestor;
	private PanelTable panelTable;
	private Properties properties;
	private DialogoCrearUsuario dialogoCrearUSuario;

	public Controlador() {
		dialogoAdministrador = new DialogoAdministrador(this);
		dialogoUsuario = new DialogoUsuario(this);
		dialogoCrearLibro = new DialogoCrearLibro(this);
		panelTable = new PanelTable(this);
		gestor = new GestorLibros();
		properties = new Properties();
		dialogoCrearUSuario = new DialogoCrearUsuario(this);
		cargarProperties("/archivos_properties/ingles.properties");
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
		case AC_CREAR_LIBRO:
			agregarNuevoLibro();
			dialogoCrearLibro.limpiarFormulario();
			break;
		case AC_BTN_CANCELAR_DIALOGO:
			dialogoCrearLibro.setVisible(false);
		case AC_BTN_CONFIRMAR_USUARIO:
			dialogoUsuario.setVisible(true);
			break;
		case AC_RDBTN_BUSCAR_ID_ADMINISTRADOR:
			panelTable.filtrarId();
			break;
		case AC_RDBTN_BUSCAR_TITULO_ADMINSTRADOR:
			panelTable.filtrarTitulo();
			break;
		case AC_RDBTN_BUSCAR_AUTOR_ADMINISTRADOR:
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
		case AC_BTN_MOSTRAR_DIALOGO_CREAR_USUARIO:
			dialogoCrearUSuario.setVisible(true);
		case A_MOSTRAR_SUBIR_IMAGEN:
			implementarArchivoLibro();
		}
	}

	public void agregarNuevoLibro(){
		Libro libro = dialogoCrearLibro.crearLibro();
		if (libro != null) {	
			gestor.agregarLibro(libro);;
			panelTable.agregarLibroTabla(libro);
			panelTable.actualizarTabla(gestor.getListaLibro());
		}
		dialogoCrearLibro.dispose();
	}

	private void actualizarIdiomaEspanol(){
		cargarProperties("/archivos_properties/espanol.properties");
		dialogoAdministrador.init();
		dialogoUsuario.init();
		dialogoCrearLibro.init();
	}

	private void actualizarIdiomaIngles(){
		cargarProperties("/archivos_properties/ingles.properties");
		dialogoAdministrador.init();
		dialogoUsuario.init();
		dialogoCrearLibro.init();
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {

	}

	public void eliminarLibro(){
		int id = panelTable.eliminarLibro();
		try {
			gestor.eliminarLibro(gestor.buscarLibro(id));
		} catch (ExcepcionLibroNoEncontrado e) {
			e.printStackTrace();
		}
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

	public File implementarArchivoLibro(){
		File archivoLibro = dialogoCrearLibro.cargarLibro();
		return archivoLibro;
	}

	public static void main(String[] args) {
		VentanaPrincipal vt = new VentanaPrincipal();
		vt.init();
		vt.setVisible(true);
	}
}