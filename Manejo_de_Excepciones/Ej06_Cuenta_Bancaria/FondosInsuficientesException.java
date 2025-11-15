package Ej06_Cuenta_Bancaria;

public class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String message) {
        super(message);
    }
}