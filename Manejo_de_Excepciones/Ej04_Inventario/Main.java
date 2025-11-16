package Ej04_Inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            inventario.agregarProducto(new Producto("A001", "Laptop", 1500, 10));
            inventario.agregarProducto(new Producto("A002", "Mouse", 50, 30));
            inventario.agregarProducto(new Producto("A001", "Teclado", 100, 5)); 
        } catch (ProductoExistenteException | IllegalArgumentException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        
        try {
            inventario.agregarProducto(new Producto("A003", "Monitor", -200, 5));
        } catch (ProductoExistenteException | IllegalArgumentException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }

        inventario.mostrarInventario();

        try {
            System.out.println("\nIntentando vender A002 (3 unidades)...");
            inventario.venderProducto("A002", 3);
            
            System.out.println("\nIntentando vender A001 (20 unidades)...");
            inventario.venderProducto("A001", 20); 

        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }
        
        try {
            System.out.println("\nIntentando vender A005 (1 unidad)...");
            inventario.venderProducto("A005", 1); 

        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }

        inventario.mostrarInventario();
    }
}