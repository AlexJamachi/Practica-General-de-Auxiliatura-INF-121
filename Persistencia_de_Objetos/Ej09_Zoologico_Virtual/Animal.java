package Ej09_Zoologico_Virtual;

public class Animal {
    private String especie;
    private String nombre;
    private int cantidad;

    public Animal(String e, String n, int c) { especie=e; nombre=n; cantidad=c; }
    public String getEspecie() { return especie; }
    @Override public String toString() { return nombre + " (" + especie + ")"; }
}