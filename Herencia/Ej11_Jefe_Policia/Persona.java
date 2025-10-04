package Herencia.Ej11_Jefe_Policia;
public class Persona {
    protected String nombre;
    protected String ci;
    public Persona(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
    public String getNombre() {
        return nombre;
    }
}