package Ej04_Inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("Producto con código " + codigo + " no encontrado.");
    }

    public void agregarProducto(Producto p) throws ProductoExistenteException {
        try {
            buscarProducto(p.getCodigo());
            throw new ProductoExistenteException("El código " + p.getCodigo() + " ya existe.");
        } catch (ProductoNoEncontradoException e) {
            productos.add(p);
            System.out.println("Producto '" + p.getNombre() + "' agregado.");
        }
    }

    public void venderProducto(String codigo, int cantidad) 
        throws ProductoNoEncontradoException, StockInsuficienteException {
        
        Producto p = buscarProducto(codigo);
        p.vender(cantidad);
        System.out.println("Venta exitosa: " + cantidad + " de '" + p.getNombre() + "'. Stock restante: " + p.getStock());
    }

    public void mostrarInventario() {
        System.out.println("--- Inventario Actual ---");
        for (Producto p : productos) {
            p.mostrar();
        }
        System.out.println("-------------------------");
    }
}