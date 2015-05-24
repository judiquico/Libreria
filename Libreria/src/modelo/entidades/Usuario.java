package modelo.entidades;

public class Usuario {
	private double dineroDisponible;
	private Libro libro;
	private String nombre;

	public Usuario(double dineroDisponible, Libro libro, String nombre) {
		super();
		this.dineroDisponible = dineroDisponible;
		this.libro = libro;
		this.nombre = nombre;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}