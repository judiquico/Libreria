package vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import modelo.entidades.Libro;
import modelo.util.Util;
import controlador.Controlador;

public class PanelTable  extends JPanel{

	/**
	 * @author Ruth Rojas
	 */
	private static final long serialVersionUID = 1L;
	private JTable tablaLibros;
	private DefaultTableModel modelo;
	private BarraHerramientasAdministrador barraAdministrador;
	private TableRowSorter<TableModel> trsfiltro;
	
	
	public PanelTable(Controlador controlador) {
		modelo = new DefaultTableModel(){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable (int fila, int columna) {
				return false;
			}
		};
		modelo.setColumnIdentifiers(new String[]{"Id", "Nombre", "Información", "Valor"});
		tablaLibros = new JTable(modelo);
		barraAdministrador = new BarraHerramientasAdministrador(controlador);
		tablaLibros.getTableHeader().setReorderingAllowed(false);
		tablaLibros.getSelectionModel().addListSelectionListener(controlador);
		add(new JScrollPane(tablaLibros));
	}
	public int getSelect(){
		return tablaLibros.getSelectedRow();
	}
	
	public void agregarLibroTabla(Libro libro){
		modelo.addRow(Util.libroAVector(libro));
	}
	
	public void actualizarTabla(ArrayList<Libro> listaLibros){
		for (Libro libro : listaLibros) {
			modelo.addRow(Util.libroAVector(libro));
		}
	}
	
	public void filtroId(){
		trsfiltro.setRowFilter(RowFilter.regexFilter(barraAdministrador.getTextBuscar().getText(), 0));
	}
	public void filtroTitulo(){
		trsfiltro.setRowFilter(RowFilter.regexFilter(barraAdministrador.getTextBuscar().getText(), 1));
	}
	public void filtroAutor(){
		trsfiltro.setRowFilter(RowFilter.regexFilter(barraAdministrador.getTextBuscar().getText(), 2));
	}
	public void filtrarId() {
		barraAdministrador.getTextBuscar().addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
			String cadena = (barraAdministrador.getTextBuscar().getText());
			barraAdministrador.getTextBuscar().setText(cadena);
			repaint();
			filtrarId();
			}
			});
			trsfiltro = new TableRowSorter<TableModel>(tablaLibros.getModel());
			tablaLibros.setRowSorter(trsfiltro);
	}
	public void filtrarTitulo() {
		barraAdministrador.getTextBuscar().addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
			String cadena = (barraAdministrador.getTextBuscar().getText());
			barraAdministrador.getTextBuscar().setText(cadena);
			repaint();
			filtroTitulo();
			}
			});
			trsfiltro = new TableRowSorter<TableModel>(tablaLibros.getModel());
			tablaLibros.setRowSorter(trsfiltro);
	}
	public void filtrarAutor() {
		barraAdministrador.getTextBuscar().addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
			String cadena = (barraAdministrador.getTextBuscar().getText());
			barraAdministrador.getTextBuscar().setText(cadena);
			repaint();
			filtroAutor();
			}
			});
			trsfiltro = new TableRowSorter<TableModel>(tablaLibros.getModel());
			tablaLibros.setRowSorter(trsfiltro);
	}

	public int eliminarLibro() {
		int id = Integer.parseInt((String) modelo.getValueAt(
				tablaLibros.getSelectedRow(), 0));
		modelo.removeRow(tablaLibros.getSelectedRow());
		return id;
	}	
}