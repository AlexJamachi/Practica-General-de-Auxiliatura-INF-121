package Herencia.Ej01_Persona_Jerarquia;
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String ci;
    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("CI: " + ci);
    }
}