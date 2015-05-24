package modelo.entidades;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private int id;
	private double dinero;
	private static int consecutivo;
	private ArrayList<Libro> listaLibro;

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
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

	@Override
	public String toString() {
		return nombre + ","+ dinero;
	}
}