package Ej03_Tienda_Productos;

public class Main {
    public static void main(String[] args) {
        ArchivoProducto ap = new ArchivoProducto("productos.json");
        ap.guardaProducto(new Producto(1, "Coca Cola", 10.5f));
        ap.guardaProducto(new Producto(2, "Pan", 0.5f));
        
        System.out.println("Buscando codigo 1: " + ap.buscaProducto(1));
        ap.calcularPromedio();
        System.out.println("Mas caro:");
        ap.mostrarMasCaro();
    }
}