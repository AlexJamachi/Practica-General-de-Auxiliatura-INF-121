package Ej06_Biblioteca;

public class Libro {
    private String codLibro;
    private String titulo;
    private double precio;

    public Libro(String c, String t, double p) { codLibro = c; titulo = t; precio = p; }
    public String getCodLibro() { return codLibro; }
    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }
    @Override public String toString() { return titulo; }
}