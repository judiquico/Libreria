package modelo.util;


import modelo.Genero;
import modelo.Libro;

public class Util {
	
	public static String[] libroAVector(Libro libro){
		return new String[]{Integer.toString(libro.getIdLibro()),libro.getTitulo(),
				libro.getDescripcion(), Double.toString(libro.getValor())};
	}

}
