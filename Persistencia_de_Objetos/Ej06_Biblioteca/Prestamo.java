package Ej06_Biblioteca;

public class Prestamo {
    private String codCliente;
    private String codLibro;
    private int cantidad;

    public Prestamo(String cc, String cl, int cant) { codCliente = cc; codLibro = cl; cantidad = cant; }
    public String getCodLibro() { return codLibro; }
    public String getCodCliente() { return codCliente; }
    public int getCantidad() { return cantidad; }
}