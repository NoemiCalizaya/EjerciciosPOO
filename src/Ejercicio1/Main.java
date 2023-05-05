package Ejercicio1;

public class Main {
	/*
	 Define una clase abstracta Figura con un método abstracto calcularArea().
	 
	Define dos subclases de Figura: Cuadrado y Circulo. La clase Cuadrado debe
	tener un atributo lado y la clase Circulo debe tener un atributo radio.

	Implementa el método abstracto calcularArea() en ambas subclases de Figura. 
	El método debe devolver el área correspondiente a la figura.

    En una clase Main, crea objetos de ambas subclases de Figura y utiliza 
    polimorfismo para llamar al método calcularArea() en los objetos. 
    Imprime los resultados en la consola.
	*/
	public static void main(String[] args) {
		Figura figura1 = new Cuadrado(5);
        Figura figura2 = new Circulo(3);

        System.out.println("El area del cuadrado es: " + figura1.calcularArea());
        System.out.println("El area del circulo es: " + figura2.calcularArea());
	}

}
