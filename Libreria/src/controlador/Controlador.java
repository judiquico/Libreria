package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.DialogoAdministrador;
import vista.DialogoCrearLibro;
import vista.DialogoUsuario;
import vista.VentanaInicio;

public class Controlador implements ActionListener {

	public static final String AC_BTN_USUARIO = "BOTON ENTRAR POR USUARIO";
	public static final String AC_BTN_ADMINISTRADOR = "BOTON ENTRAR POR ADMINISTRADOR";
	public static final String AC_BTN_COMPRAR_LIBRO = "ACCION COMPRAR LIBRO";
	public static final String AC_MOSTRAR_DIALOGO_CREAR_LIBRO = "DIALOGO CREAR NUEVO LIBRO";
	public static final String AC_CONFIRM_CREAR_LIBRO = "CREAR EL NUEVO LIBRO";
	public static final String AC_BTN_CANCELAR_DIALOGO = "CERRAR EL DIALOGO";
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	private DialogoCrearLibro dialogoCrearLibro;

	public Controlador() {
		dialogoAdministrador = new DialogoAdministrador(this);
		dialogoUsuario = new DialogoUsuario(this);
		dialogoCrearLibro = new DialogoCrearLibro(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case AC_BTN_USUARIO:
			System.out.println("hola");
			dialogoUsuario.setVisible(true);
			break;
		case AC_BTN_ADMINISTRADOR:
			dialogoAdministrador.setVisible(true);
			System.out.println("Administrador");
			break;
		case AC_MOSTRAR_DIALOGO_CREAR_LIBRO:
			dialogoCrearLibro.setVisible(true);
			break;
		case AC_CONFIRM_CREAR_LIBRO:
			System.out.println("la cogio");
			break;
		case AC_BTN_CANCELAR_DIALOGO:
			dialogoCrearLibro.dispose();
		}
	}

	public static void main(String[] args) {
		VentanaInicio ventanaInicio = new VentanaInicio();
		ventanaInicio.setVisible(true);
	}
}
