package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JButton;
import controlador.Controlador;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private ImageIcon backgorund;
	private JLabel lblImagen;
	private Controlador controlador;
	
	private JPanel panel ;
	private JButton btnUsuario ;
	private JButton btnAdministrador ;
	
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/iconoLibreria.png")));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 375);
		setResizable(false);
		setTitle(ConstantesVista.TITULO);
		setLocationRelativeTo(null);
		controlador = new Controlador();

		panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		getContentPane().add(panel, BorderLayout.NORTH);

		btnUsuario = new JButton();
		btnUsuario.setBackground(new Color(204, 204, 255));
		btnUsuario.addActionListener(controlador);
		btnUsuario.setActionCommand(Controlador.AC_BTN_USUARIO);
		btnUsuario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/iconoUsuario.png")));
		panel.add(btnUsuario);

		btnAdministrador = new JButton();
		btnAdministrador.setBackground(new Color(255, 204, 204));
		btnAdministrador.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/iconoAdministrador.png")));
		btnAdministrador.addActionListener(controlador);
		btnAdministrador.setActionCommand(Controlador.AC_BTN_ADMINISTRADOR);
		panel.add(btnAdministrador);

		JPanel panelImagen = new JPanel();
		getContentPane().add(panelImagen, BorderLayout.CENTER);
		panelImagen.setLayout(null);

		lblImagen = new JLabel();
		this.lblImagen.setLocation(0, 0);
		this.lblImagen.setSize(584, 263);
		lblImagen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/libros.jpg")));
		panelImagen.add(lblImagen);

	}

	public ImageIcon getBackgorund() {
		return backgorund;
	}

	public void setBackgorund(ImageIcon backgorund) {
		this.backgorund = backgorund;
	}
	
	public void init(){
		this.setTitle(ConstantesVista.TITULO);
		btnUsuario.setText(ConstantesVista.BTN_USUARIO);
		btnAdministrador.setText(ConstantesVista.BTN_ADMINISTRADOR);
	}
}