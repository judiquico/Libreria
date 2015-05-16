package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.TextField;
import javax.swing.JTable;
import java.awt.Scrollbar;
import javax.swing.JCheckBox;

public class DialogoUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;



	public DialogoUsuario() {
		setTitle("Usuario\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				DialogoUsuario.class.getResource("/imagenes/iconoUsuario.png")));
		setLayout(new BorderLayout());
		setSize(584, 358);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton);

		JButton btnConfirmar = new JButton("Confirmar");
		panel.add(btnConfirmar);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_1);

		TextField textField = new TextField(20);
		panel_1.add(textField);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Autor");
		panel_1.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Libro");
		panel_1.add(chckbxNewCheckBox_1);

		table = new JTable();
		getContentPane().add(table, BorderLayout.CENTER);

		Scrollbar scrollbar = new Scrollbar();
		getContentPane().add(scrollbar, BorderLayout.EAST);

	}

}
