package Ej02_Calculadora;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public static int convertirANumero(String texto) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("El valor '" + texto + "' no es un número válido.");
        }
    }
}