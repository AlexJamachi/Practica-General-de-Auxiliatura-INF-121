package Ej06_Cuenta_Bancaria;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) throws IllegalArgumentException {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        this.saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (monto > this.saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo disponible: " + this.saldo);
        }
        this.saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
    }

    public void mostrarInfo() {
        System.out.println("--- Cuenta Bancaria ---");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-------------------------");
    }
}