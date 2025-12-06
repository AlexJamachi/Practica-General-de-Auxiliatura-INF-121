package Ej06_Biblioteca;

public class Cliente {
    private String codCliente;
    private String nombre;

    public Cliente(String c, String n) { codCliente = c; nombre = n; }
    public String getCodCliente() { return codCliente; }
    public String getNombre() { return nombre; }
    @Override public String toString() { return nombre; }
}