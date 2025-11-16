package Ej04_Inventario;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Precio y stock no pueden ser negativos.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }
    
    public void vender(int cantidad) throws StockInsuficienteException {
        if (cantidad > this.stock) {
            throw new StockInsuficienteException("Stock insuficiente para " + nombre + ". (Stock: " + this.stock + ")");
        }
        this.stock -= cantidad;
    }

    public void mostrar() {
        System.out.println("  - [" + codigo + "] " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}