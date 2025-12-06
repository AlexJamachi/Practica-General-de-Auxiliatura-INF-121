package Ej07_Salud_Infantil;

public class Niño {
    private String nombre;
    private int edad;
    private double peso; 
    private double talla; 
    private int carnet;

    public Niño(String n, int e, double p, double t, int c) {
        nombre=n; edad=e; peso=p; talla=t; carnet=c;
    }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public double getTalla() { return talla; }
    public int getCarnet() { return carnet; }
    @Override public String toString() { return nombre + " CI:" + carnet; }
}