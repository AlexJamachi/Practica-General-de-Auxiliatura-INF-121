package Ej08_Alimentos_Refrigerador;

public class Alimento {
    private String nombre;
    private String fechaVencimiento; 
    private int cantidad;

    public Alimento(String n, String f, int c) { nombre=n; fechaVencimiento=f; cantidad=c; }
    public String getNombre() { return nombre; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public int getCantidad() { return cantidad; }
    @Override public String toString() { return nombre + " (" + cantidad + ")"; }
}