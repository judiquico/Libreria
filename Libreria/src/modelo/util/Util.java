package modelo.util;

import modelo.entidades.Autor;
import modelo.entidades.Cliente;
import modelo.entidades.Libro;

public class Util {

	public static boolean validarValor(String numero){
		try {
			Double.parseDouble(numero);	
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean validarCopias(String numero){
		try {
			Double.parseDouble(numero);	
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static String[] libroAVector(Libro libro){
		return new String[]{Integer.toString(libro.getId()),libro.getNombre(),
				libro.getDescripcion(),Double.toString(libro.getValor()),libro.getGenero(),
				libro.getAutor(),Double.toString(libro.getCopiasVendidas()),libro.getImage()};
	}

	public static String[] clienteAVector(Cliente cliente){
		return new String[]{Integer.toString(cliente.getId()),cliente.getNombre(),
				Double.toString(cliente.getCredito())};
	}
	
	public static String[] autorAVector(Autor autor){
		return new String[]{Integer.toString(autor.getId_autor()),autor.getNombre()};
	}
}