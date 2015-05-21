package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controlador.Controlador;

public class MenuLibro  extends JMenuBar {
	
	private static final long serialVersionUID = 1L;
	private JMenuItem itemImportar ;
	private JMenuItem itemExportar ;
	private JMenuItem itemSalir ;
	private JMenu mnArchivo ;
	private JMenu mnOpciones ;
	private JMenu itemIdioma ;
	private JMenuItem itemEspanol ;
	private JMenuItem itemIngles ;
	private JMenu mnAyuda;
	private JMenuItem itemAcercaDe ;
	
	public MenuLibro(Controlador controlador) {

		mnArchivo = new JMenu("ARCHIVO");
		this.add(mnArchivo);

		itemImportar = new JMenuItem();
		mnArchivo.add(itemImportar);
		
		itemExportar = new JMenuItem();
		mnArchivo.add(itemExportar);

		itemSalir = new JMenuItem();
		mnArchivo.add(itemSalir);

		mnOpciones = new JMenu();
		this.add(mnOpciones);

		itemIdioma = new JMenu();
		mnOpciones.add(itemIdioma);
		
		itemEspanol = new JMenuItem();
		itemEspanol.addActionListener(controlador);
		itemEspanol.setActionCommand(Controlador.AC_BTN_CAMBIAR_A_ESPANIOL);
		itemIdioma.add(itemEspanol);
		
		itemIngles = new JMenuItem();
		itemIngles.addActionListener(controlador);
		itemIngles.setActionCommand(Controlador.AC_BTN_CAMBIAR_A_INGLES);
		itemIdioma.add(itemIngles);

		mnAyuda = new JMenu();
		this.add(mnAyuda);

		itemAcercaDe = new JMenuItem();
		mnAyuda.add(itemAcercaDe);
	}

	public void  initMenu() {
		
		itemImportar.setText(ConstantesVista.T_MENU_ITEM_IMPORTAR);
		itemExportar.setText(ConstantesVista.T_MENU_ITEM_EXPORTAR);
		itemSalir.setText(ConstantesVista.T_MENU_ITEM_SALIR);
		mnArchivo.setText(ConstantesVista.T_MENU_ARCHIVO);
		mnOpciones.setText(ConstantesVista.T_MENU_OPCIONES);
		itemIdioma.setText(ConstantesVista.T_MENU_ITEM_IDIOMA);
		itemEspanol.setText(ConstantesVista.T_MENU_ITEM_ESPANIOL);
		itemIngles.setText(ConstantesVista.T_MENU_ITEM_INGLES);
		itemAcercaDe.setText(ConstantesVista.T_MENU_ITEM_ACERCA_DE);
		
	}

}
