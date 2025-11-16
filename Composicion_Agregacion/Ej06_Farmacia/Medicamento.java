package Ej06_Farmacia;

public class Medicamento extends Producto {
    private int dosisMg;
    private boolean requiereReceta;

    public Medicamento(String nombre, double precio, int dosisMg, boolean requiereReceta) {
        super(nombre, precio);
        this.dosisMg = dosisMg;
        this.requiereReceta = requiereReceta;
    }

    @Override
    public void mostrar() {
        System.out.println("  [M] " + nombre + " (" + dosisMg + "mg) - $" + precio + " (Receta: " + requiereReceta + ")");
    }
}