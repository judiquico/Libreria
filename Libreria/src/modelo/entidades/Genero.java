package modelo.entidades;

public enum Genero{
	DEPORTE ("Deporte"), CULTURA ("Cultura"), INGENIERIA ("Ingenier�a"), CIENCIAS_BASICAS ("Ciencias B�sicas"), 
	CIENCIAS_ECONOMICAS ("Ciencias Econ�micas"), OCIO ("Ocio"),LITERATURA ("Literatura"), 
	CIENCIAS_COMPUTACIONALES ("Ciencias computacionales"), CIENCIAS_SOCIALES ("Ciencias Sociales"), SALUD ("Salud"), 
	POLITICA ("Pol�tica"), RELIGION ("Religi�n"), MISTERIO ("Misterio"), CIENCIAS_EXACTAS ("Ciencias exactas"), FILOSOFIA ("Filosof�a"), 
	ARTE ("Arte"), ARQUITECTUTA ("Arquitectura"), EDUCACION ("Educaci�n"), OCULTISMO ("Ocultismo"), HISTORIA ("Historia"), 
	GEOGRAFIA ("Geograf�a"), OTROS ("Otros");
	
	private final String genero;

	private Genero(String s) {
		genero = s;
	}
	public boolean nombre(String nombre){
		return (nombre == null)? false: genero.equals(nombre);
	}

	public String toString(){
		return genero;
	}
}