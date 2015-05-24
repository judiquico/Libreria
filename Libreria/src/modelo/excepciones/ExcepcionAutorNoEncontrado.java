package modelo.excepciones;

public class ExcepcionAutorNoEncontrado  extends Exception{
	private static final long serialVersionUID = 1L;
	public static final String ERROR_AUTOR_NO_ENCONTRADO ="El autor buscado no ha sido encontrado";

	public ExcepcionAutorNoEncontrado(String nombre) {
		super(ERROR_AUTOR_NO_ENCONTRADO + "("+ nombre+")");
	}

	public ExcepcionAutorNoEncontrado(int id) {
		super(ERROR_AUTOR_NO_ENCONTRADO + "("+ id+")");
	}
}