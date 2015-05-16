package modelo;

public class Autor {

	private int id_autor;
	private String nombre;

	public Autor(int id_autor, String nombre) {
		super();
		this.id_autor = id_autor;
		this.nombre = nombre;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
