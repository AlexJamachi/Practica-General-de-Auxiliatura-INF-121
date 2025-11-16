package Ej04_Inventario;

public class ProductoExistenteException extends Exception {
    public ProductoExistenteException(String message) {
        super(message);
    }
}