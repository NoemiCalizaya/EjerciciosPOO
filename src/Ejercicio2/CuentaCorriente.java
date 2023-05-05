package Ejercicio2;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteCredito;

    public CuentaCorriente(String titular, double saldo, double limiteCredito) {
        super(titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + limiteCredito >= monto) {
            saldo -= monto;
        } else {
            System.out.println("No se puede retirar el monto especificado. Saldo insuficiente.");
        }
    }
}
