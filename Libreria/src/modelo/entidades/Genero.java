package modelo.entidades;

public enum Genero{
	DEPORTE ("Deporte"), CULTURA ("Cultura"), INGENIERIA ("Ingeniería"), CIENCIAS_BASICAS ("Ciencias Básicas"), 
	CIENCIAS_ECONOMICAS ("Ciencias Económicas"), OCIO ("Ocio"),LITERATURA ("Literatura"), 
	CIENCIAS_COMPUTACIONALES ("Ciencias computacionales"), CIENCIAS_SOCIALES ("Ciencias Sociales"), SALUD ("Salud"), 
	POLITICA ("Política"), RELIGION ("Religión"), MISTERIO ("Misterio"), CIENCIAS_EXACTAS ("Ciencias exactas"), FILOSOFIA ("Filosofía"), 
	ARTE ("Arte"), ARQUITECTUTA ("Arquitectura"), EDUCACION ("Educación"), OCULTISMO ("Ocultismo"), HISTORIA ("Historia"), 
	GEOGRAFIA ("Geografía"), OTROS ("Otros");
	
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