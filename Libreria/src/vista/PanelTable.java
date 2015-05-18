package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

public class PanelTable  extends JPanel{

	/**
	 * @author Ruth Rojas
	 */
	private static final long serialVersionUID = 1L;
	private JTable tablaLibros;
	private DefaultTableModel modelo;
	private Controlador controlador;

	public PanelTable(Controlador controlador) {
		modelo = new DefaultTableModel(new String []{"Id","Titulo","Autor", "Descripcion","Valor", "Ejemplares Vendidos", "Categoria"},0);
		tablaLibros= new JTable(modelo);
		this.controlador= controlador;
		add(new JScrollPane(tablaLibros));
	}
}
