package Ej05_Red_Farmacias;

public class Medicamento {
    private String nombre;
    private String tipo;
    private double precio;

    public Medicamento(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() { return nombre + " (" + tipo + ")"; }
}