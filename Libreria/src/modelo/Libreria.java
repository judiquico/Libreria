package modelo;

public class Libreria {

	private String nombre;
	private Libro libro;
	private String direccion;
	private Usuario usuario;

	public Libreria(String nombre, Libro libro, String direccion,
			Usuario usuario) {
		super();
		this.nombre = nombre;
		this.libro = libro;
		this.direccion = direccion;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
