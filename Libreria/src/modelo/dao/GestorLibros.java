package modelo.dao;

import java.util.ArrayList;

import modelo.Autor;
import modelo.Genero;
import modelo.Libro;
import modelo.util.Util;

public class GestorLibros {
	
	private ArrayList<Libro>listaLibros;
	
	public GestorLibros() {
		listaLibros = new ArrayList<Libro>();
	}

	public static Libro crearLibro(String titulo, Autor autor,
			String descripcion, Double valor, Genero genero) {
			return new Libro(titulo, autor, descripcion, valor, genero);
	}

	public void agregarLibro(Libro nuevoLibro) {
		listaLibros.add(nuevoLibro);
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

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
}