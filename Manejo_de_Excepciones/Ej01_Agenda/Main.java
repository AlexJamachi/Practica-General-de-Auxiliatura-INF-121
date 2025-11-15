package Ej01_Agenda;

public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        try {
            miAgenda.agregarContacto("Juan Perez", "77712345");
            miAgenda.agregarContacto("Ana Gomez", "66654321");
            miAgenda.agregarContacto("Luis", ""); 
        } catch (DatosInvalidosException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        
        try {
            miAgenda.agregarContacto("", "123456"); 
        } catch (DatosInvalidosException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }

        System.out.println();
        miAgenda.mostrarAgenda();
        System.out.println();

        try {
            System.out.println("Buscando a 'Ana Gomez'...");
            Contacto c = miAgenda.buscarContacto("Ana Gomez");
            c.mostrar();
        } catch (ContactoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nBuscando a 'Pedro'...");
            Contacto c = miAgenda.buscarContacto("Pedro");
            c.mostrar();
        } catch (ContactoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}