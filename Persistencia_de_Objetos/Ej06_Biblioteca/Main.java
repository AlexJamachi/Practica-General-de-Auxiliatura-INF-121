package Ej06_Biblioteca;

public class Main {
    public static void main(String[] args) {
        GestorBiblioteca gb = new GestorBiblioteca();
        gb.addLibro(new Libro("L1", "Java", 100));
        gb.addLibro(new Libro("L2", "Python", 80));
        gb.addCliente(new Cliente("C1", "Pepe"));
        gb.addPrestamo(new Prestamo("C1", "L1", 2));
        
        gb.guardarTodo();
        System.out.println("No vendidos:");
        gb.librosNuncaVendidos();
    }
}