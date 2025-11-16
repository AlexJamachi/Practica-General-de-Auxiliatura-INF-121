package Ej06_Farmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombre;
    private List<Producto> productos;
    private List<RegistroVenta> registros;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public void addProducto(Producto p) {
        this.productos.add(p);
    }

    public void addRegistro(RegistroVenta r) {
        this.registros.add(r);
    }

    public void mostrarInventario() {
        System.out.println("--- Inventario Farmacia: " + nombre + " ---");
        for (Producto p : productos) {
            p.mostrar();
        }
    }

    public void mostrarRegistros() {
        System.out.println("--- Registros Farmacia: " + nombre + " ---");
        for (RegistroVenta r : registros) {
            r.mostrar();
        }
    }
}