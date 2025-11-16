package Ej04_Inventario;

public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String message) {
        super(message);
    }
}