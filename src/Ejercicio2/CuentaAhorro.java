package Ejercicio2;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("No se puede retirar el monto especificado. Saldo insuficiente.");
        }
    }
    
    public double calcularInteres() {
        double tasaMensual = tasaInteres / 12;
        double interesMensual = saldo * tasaMensual;
        return interesMensual;
    }
}
