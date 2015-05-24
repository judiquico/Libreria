package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Libro;
import modelo.excepciones.ExcepcionLibroNoEncontrado;
import modelo.util.Util;

public class GestorLibros {

	private ArrayList<Libro> listaLibro;

	public GestorLibros() {
		listaLibro = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro libro){
		listaLibro.add(libro);
	}

	public void eliminarLibro(Libro libro){
		listaLibro.remove(libro);	
	}

	public Libro buscarLibro(int id) throws ExcepcionLibroNoEncontrado{
		for (Libro libro:listaLibro ) {
			if (libro.getId() == id) {
				return libro;
			}
		}
		throw new ExcepcionLibroNoEncontrado(id);
	}

	public Libro buscarLibro(String nombre) throws ExcepcionLibroNoEncontrado{
		for (Libro libro:listaLibro) {
			if (libro.getNombre().equalsIgnoreCase(nombre)) {
				return libro;
			}
		}
		throw new ExcepcionLibroNoEncontrado(nombre);
	}

	public static Libro crearLibro(String nombre, String descripcion, String valor, String genero, String autor, String ruta){
		if (Util.validarValor(valor)) {
			return new Libro(nombre, descripcion, Double.parseDouble(valor),
					genero,autor, ruta);	
		}
		return null;
	}

	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}
}