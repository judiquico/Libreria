package modelo.dao;

import java.util.ArrayList;

import modelo.entidades.Cliente;
import modelo.excepciones.ExcepcionClienteNoEncontrado;
import modelo.util.Util;

public class GestorCliente {
	private ArrayList<Cliente> listaClientes;

	public GestorCliente() {
		listaClientes = new ArrayList<Cliente>();
	}

	public void agregarCliente(Cliente cliente){
		listaClientes.add(cliente);
	}

	public void eliminarCliente(Cliente cliente){
		listaClientes.remove(cliente);	
	}

	public Cliente buscarCliente(int id) throws ExcepcionClienteNoEncontrado{
		for (Cliente cliente: listaClientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		throw new ExcepcionClienteNoEncontrado(id);
	}

	public Cliente buscarCliente(String nombre) throws ExcepcionClienteNoEncontrado{
		for (Cliente cliente : listaClientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				return cliente;
			}
		}
		throw new ExcepcionClienteNoEncontrado(nombre);
	}

	public static Cliente crearCliente(String nombre, String valor){
		if (Util.validarValor(valor)) {
			return new Cliente(nombre, Double.parseDouble(valor));	
		}
		return null;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
}