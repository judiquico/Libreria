package modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author parra
 *
 */
public class Cliente  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String contrasena;
	private int id;
	private double dinero;
	private static int consecutivo;
	private ArrayList<Libro> listaLibros;
	

	public Cliente(String nombre , String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	
	public Cliente(String nombre, double dinero) {
		this.nombre = nombre;
		this.id = consecutivo;
		this.dinero = dinero;
		consecutivo++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public ArrayList<Libro> getListaLibro() {
		return listaLibros;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibros = listaLibro;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return nombre + ","+ dinero;
	}
}