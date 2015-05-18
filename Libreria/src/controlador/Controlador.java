package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import vista.DialogoAdministrador;
import vista.DialogoUsuario;
import vista.VentanaInicio;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener {
	
	public static final String AC_BTN_USUARIO = "BOTON ENTRAR POR USUARIO";
	public static final String AC_BTN_ADMINISTRADOR = "BOTON ENTRAR POR ADMINISTRADOR";
	public static final String AC_BTN_COMPRAR_LIBRO = "ACCION COMPRAR LIBRO";
	private VentanaPrincipal ventanaPrincipal;
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	
	public Controlador() {
		dialogoAdministrador = new DialogoAdministrador();
		dialogoUsuario = new DialogoUsuario();
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
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		VentanaInicio ventanaInicio = new VentanaInicio();
		ventanaInicio.setVisible(true);

	}

}
