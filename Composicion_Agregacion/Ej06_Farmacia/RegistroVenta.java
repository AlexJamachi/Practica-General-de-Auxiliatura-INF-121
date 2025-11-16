package Ej06_Farmacia;

public class RegistroVenta {
    private int id;
    private String fecha;
    private double total;

    public RegistroVenta(int id, String fecha, double total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public void mostrar() {
        System.out.println("  [Venta " + id + "] Fecha: " + fecha + ", Total: $" + total);
    }
}