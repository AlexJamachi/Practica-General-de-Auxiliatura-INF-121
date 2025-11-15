package Ej06_Cuenta_Bancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
        cuenta.mostrarInfo();

        try {
            System.out.println("Intentando depositar 500...");
            cuenta.depositar(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando depositar -100...");
            cuenta.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando retirar 300...");
            cuenta.retirar(300);
        } catch (FondosInsuficientesException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando retirar 2000...");
            cuenta.retirar(2000);
        } catch (FondosInsuficientesException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        cuenta.mostrarInfo();
    }
}