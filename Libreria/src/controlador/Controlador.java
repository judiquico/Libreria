package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import vista.DialogoAdministrador;
import vista.DialogoUsuario;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener {
	
	private VentanaPrincipal ventanaPrincipal;
	private DialogoAdministrador dialogoAdministrador;
	private DialogoUsuario dialogoUsuario;
	
	public Controlador() {
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//		
	}
	
	public static void main(String[] args) {
		VentanaPrincipal vt = new VentanaPrincipal();
		vt.setVisible(true);
		DialogoUsuario dialog = new DialogoUsuario();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		DialogoAdministrador dialog1 = new DialogoAdministrador();
		dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog1.setVisible(true);

	}

}
