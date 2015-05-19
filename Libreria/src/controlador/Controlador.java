package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	private DialogoCrearLibro dialogoCrearLibro;
	private GestorLibros gestor;
	private PanelTable panelTable;

	public Controlador() {
		dialogoAdministrador = new DialogoAdministrador(this);
		dialogoUsuario = new DialogoUsuario(this);
		dialogoCrearLibro = new DialogoCrearLibro(this);
		panelTable = new PanelTable(this);
		gestor = new GestorLibros();
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
			break;
		case AC_BTN_CANCELAR_DIALOGO:
			dialogoCrearLibro.dispose();
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

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		VentanaPrincipal vt = new VentanaPrincipal();
		vt.setVisible(true);
	}
}
