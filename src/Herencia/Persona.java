package Herencia;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	/*Un método definido como protected puede ser utilizado 
desde cualquier clase de su mismo paquete, y también desde subclases de otros paquetes.
El acceso desde las subclases de otros paquetes se puede realizar dentro del contexto de la herencia, no 
a través de la creación directa de objetos:*/
	protected void mostrar() {
		nombre = "Alcira";
		apellidos = "Aguirre";
		edad = 34;
		System.out.println(nombre+" "+apellidos+" "+edad);
	}
}
