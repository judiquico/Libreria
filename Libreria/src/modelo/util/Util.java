package modelo.util;


import modelo.Libro;

public class Util {
	public static boolean validarValor(String numero) {
		try {
			Double.parseDouble(numero);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static String[] libroAVector(Libro libro){
		return new String[]{String.valueOf(libro.getIdLibro()),libro.getTitulo(),
				libro.getDescripcion(), Double.toString(libro.getValor())};
	}

}
