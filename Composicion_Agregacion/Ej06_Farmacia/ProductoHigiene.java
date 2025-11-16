package Ej06_Farmacia;

public class ProductoHigiene extends Producto {
    private String marca;

    public ProductoHigiene(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public void mostrar() {
        System.out.println("  [H] " + nombre + " (Marca: " + marca + ") - $" + precio);
    }
}