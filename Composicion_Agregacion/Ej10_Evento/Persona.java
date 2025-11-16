package Ej10_Evento;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int ci;

    public Persona(String nombre, String apellido, int edad, int ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }
}