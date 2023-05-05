package Ejercicio2;

public abstract class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);

    public abstract void retirar(double monto);

    public double getSaldo() {
        return saldo;
    }
    
    public String mostrar() {
    	return titular + " " + saldo+ "\n";
    }
}
