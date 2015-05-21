package modelo;

public class Libro {

	private Autor autor;
	private String descripcion;
	private int ejemplaresVendidos;
	private int idLibro;
	private String titulo;
	private double valor;
	private Genero generoLibro;

	public Libro(String titulo,  Autor autor, String descripcion,
			 double valor) {
		super();
		this.autor = autor;
		this.descripcion = descripcion;
		this.titulo = titulo;
		this.valor = valor;
	}
	

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEjemplaresVendidos() {
		return ejemplaresVendidos;
	}

	public void setEjemplaresVendidos(int ejemplaresVendidos) {
		this.ejemplaresVendidos = ejemplaresVendidos;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Genero getGeneroLibro() {
		return generoLibro;
	}

	public void setGeneroLibro(Genero generoLibro) {
		this.generoLibro = generoLibro;
	}

}
