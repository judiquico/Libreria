package modelo.dao;

import modelo.entidades.Cliente;
import modelo.entidades.Libro;

public class Libreria {

	private GestorAutor gestorAutor;
	private GestorCliente gestorCliente;
	private GestorLibros gestorLibro;

	public Libreria() {

	}

	public void registrarCompra(Cliente cliente, Libro libro) {
		if (cliente.getDinero() >= libro.getValor()) {

		}

	}

	public void registrarDevolucion(Cliente cliente, Libro libro) {

	}

	public void copiasDisponibles(){

	}

	public void copiasvendidas(){

	}
}