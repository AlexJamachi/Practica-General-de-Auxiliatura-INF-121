package Ej06_Farmacia;

public class Main {
    public static void main(String[] args) {
        Farmacia miFarmacia = new Farmacia("Farmacorp");

        Producto m1 = new Medicamento("Paracetamol", 5.50, 500, false);
        Producto m2 = new Medicamento("Amoxicilina", 20.0, 850, true);
        Producto h1 = new ProductoHigiene("Shampoo", 15.0, "Pantene");
        Producto h2 = new ProductoHigiene("Jabón", 8.0, "Dove");

        miFarmacia.addProducto(m1);
        miFarmacia.addProducto(m2);
        miFarmacia.addProducto(h1);
        miFarmacia.addProducto(h2);

        RegistroVenta v1 = new RegistroVenta(1, "2025-11-15", 20.50);
        RegistroVenta v2 = new RegistroVenta(2, "2025-11-15", 8.0);
        
        miFarmacia.addRegistro(v1);
        miFarmacia.addRegistro(v2);

        miFarmacia.mostrarInventario();
        System.out.println();
        miFarmacia.mostrarRegistros();
    }
}