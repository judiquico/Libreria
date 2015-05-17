package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.Controlador;

public class VentanaInicio extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel panelBienvenida;
	private JPanel panelAcceso;
	private JLabel labelInfo;
	private JButton btnUsuario;
	private JButton btnAdministrador;
	private Controlador controlador;
	/**
	 * @author Ruth Rojas
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaInicio() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle(ConstantesVista.TITULO);
		this.setSize(400, 400);
		controlador = new Controlador();
		
		panelBienvenida = new JPanel();
		this.add(panelBienvenida, BorderLayout.NORTH);
		panelBienvenida.setBackground(Color.BLUE);
		
		labelInfo = new JLabel(ConstantesVista.L_LABEL_INFO);
		btnUsuario = new JButton(ConstantesVista.BTN_USUARIO);
		btnUsuario.addActionListener(controlador);
		btnUsuario.setActionCommand(Controlador.AC_BTN_USUARIO);
		btnAdministrador = new JButton(ConstantesVista.BTN_ADMINISTRADOR);
		panelAcceso = new JPanel();
		panelAcceso.add(labelInfo);
		panelAcceso.add(btnUsuario);
		panelAcceso.add(btnAdministrador);
		this.add(panelAcceso, BorderLayout.CENTER);
	}
}
