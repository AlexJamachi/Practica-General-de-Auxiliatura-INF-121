package Ej01_Agenda;

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) throws DatosInvalidosException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatosInvalidosException("El nombre no puede estar vacío.");
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new DatosInvalidosException("El teléfono no puede estar vacío.");
        }
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrar() {
        System.out.println("  - Contacto: " + nombre + ", Tel: " + telefono);
    }
}