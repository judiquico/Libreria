package modelo.excepciones;

public class ExcepcionClienteNoEncontrado extends Exception{
	private static final long serialVersionUID = 1L;
	public static final String ERROR_CLIENTE_NO_ENCONTRADO ="El cliente buscado no ha sido encontrado";


	public ExcepcionClienteNoEncontrado(int id) {
		super(ERROR_CLIENTE_NO_ENCONTRADO + "("+ id+")");
	}

	public ExcepcionClienteNoEncontrado(String nombre) {
		super(ERROR_CLIENTE_NO_ENCONTRADO + "("+ nombre+")");
	}
}