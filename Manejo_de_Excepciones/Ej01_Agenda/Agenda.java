package Ej01_Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(String nombre, String telefono) throws DatosInvalidosException {
        Contacto nuevo = new Contacto(nombre, telefono);
        contactos.add(nuevo);
        System.out.println("Contacto '" + nombre + "' agregado.");
    }

    public Contacto buscarContacto(String nombre) throws ContactoNoEncontradoException {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        throw new ContactoNoEncontradoException("El contacto '" + nombre + "' no existe en la agenda.");
    }

    public void mostrarAgenda() {
        System.out.println("Contactos en la Agenda:");
        for (Contacto c : contactos) {
            c.mostrar();
        }
    }
}