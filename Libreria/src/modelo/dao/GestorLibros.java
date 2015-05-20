package modelo.dao;

import java.util.ArrayList;

import modelo.Autor;
import modelo.Libro;
import modelo.util.Util;

public class GestorLibros {
	
	private ArrayList<Libro>listaLibros;
	
	public GestorLibros() {
		listaLibros = new ArrayList<Libro>();
	}

	public static Libro crearLibro(String titulo, Autor autor,
			String descripcion, String valor) {
		if (Util.validarValor(valor)) {
			return new Libro(titulo, autor, descripcion, Double.parseDouble(valor));
		}else
			return null;
	}

	public void agregarLibro(Libro libro) {
		listaLibros.add(libro);
	}

	public Libro libro(int id){
		for (Libro libro : listaLibros) {
			if (libro.getIdLibro()== id) {
				return libro;
			}
		}
		return null;
	}
	public void borrarLibro(Libro libro){
		listaLibros.remove(libro);
	}

	public Libro buscarLibro(int id) {
		for (Libro libro : listaLibros) {
			if (libro.getIdLibro() == id) {
				return libro;
			}
		}
		return null;
	}


}
