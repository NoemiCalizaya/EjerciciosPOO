package Herencia;

public class Estudiante extends Persona{
	/*ESTUDIANTE ES UNA PERSONA.
     CON LA FRASE “ES UN” NOS GUIAMOS QUE ESTUDIANTE HEREDA 
     DE PERSONA Y NO PERSONA DE ESTUDIANTE, YA QUE NO TODAS 
     LAS PERSONAS SON ESTUDIANTES.
    */
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
		super(nombre, apellidos, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	/*Sobrescribir un método es volver a definir en una clase
	 un método que ha sido heredado de la superclase, quedando 
	 sustituido el método antiguo por el nuevo.*/
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Nombre: "+getNombre()+
				"\nApellido: " + getApellidos()+
				"\nEdad: "+ getEdad()+
				"\nCodigo Estudiante: "+codigoEstudiante+
				"\nNota Final: "+notaFinal);
	}
}
