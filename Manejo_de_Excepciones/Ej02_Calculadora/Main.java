package Ej02_Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Probando Calculadora...");

        System.out.println("Suma 5 + 3 = " + Calculadora.sumar(5, 3));
        System.out.println("Resta 10 - 4 = " + Calculadora.restar(10, 4));
        System.out.println("Mult 6 * 7 = " + Calculadora.multiplicar(6, 7));

        try {
            System.out.println("Div 10 / 2 = " + Calculadora.dividir(10, 2));
            System.out.println("Div 10 / 0 = " + Calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error en división: " + e.getMessage());
        }

        try {
            int num1 = Calculadora.convertirANumero("123");
            System.out.println("Convertido '123' a " + num1);
            
            int num2 = Calculadora.convertirANumero("abc");
            System.out.println("Convertido 'abc' a " + num2); 
            
        } catch (NumeroInvalidoException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        }
        
        try {
            int num3 = Calculadora.convertirANumero("5.5");
            System.out.println("Convertido '5.5' a " + num3);
            
        } catch (NumeroInvalidoException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        }
    }
}