package modelo.entidades;

public class Libreria {
	private String nombre;
	private Libro libro;
	private String direccion;
	private Cliente cliente;

	public Libreria(String nombre, Libro libro, String direccion,
			Cliente cliente) {
		super();
		this.nombre = nombre;
		this.libro = libro;
		this.direccion = direccion;
		this.cliente = cliente;
	}

	public void agregarLibro (){

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}