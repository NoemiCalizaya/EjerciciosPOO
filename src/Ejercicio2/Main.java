package Ejercicio2;

import java.util.ArrayList;

public class Main {
	/*
	  Define una clase abstracta CuentaBancaria con los siguientes 
	  atributos:
		titular (String): nombre del titular de la cuenta.
		saldo (double): saldo actual de la cuenta.
	Define dos subclases de CuentaBancaria: CuentaCorriente y 
	CuentaAhorro. La clase CuentaCorriente debe tener un atributo 
	adicional limiteCredito (double) y la clase CuentaAhorro debe 
	tener un atributo adicional tasaInteres (double).

	Implementa un método abstracto calcularInteres() en la clase
	CuentaAhorro. El método debe calcular el interés mensual de la 
	cuenta de ahorro. Para simplificar el ejemplo, asumamos que la 
	tasa de interés se aplica sobre el saldo actual y que la tasa anual 
	es del 2,5%.

	En una clase Main, crea objetos de ambas subclases de CuentaBancaria 
	y utiliza polimorfismo para llamar al método calcularInteres() en el 
	objeto CuentaAhorro. Imprime los resultados en la consola.
	 */
	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaCorriente("Juan Perez", 5000, 20000);
		System.out.println(cuenta1.getSaldo());
		cuenta1 = new CuentaAhorro("Juan Perez", 5000, 1.8);
		System.out.println(cuenta1.getSaldo());
		
		ArrayList<CuentaBancaria> banco = new ArrayList<>();
		banco.add(cuenta1);
		
		for(CuentaBancaria d: banco) {
			System.out.println(d.mostrar());
		}
	}
}
