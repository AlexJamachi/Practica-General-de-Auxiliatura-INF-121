package Ej15_Estante;

public class Main {
    public static void main(String[] args) {
        Estante miEstante = new Estante("Melamina", "Grande", 3);

        Libro l1 = new Libro("Cien Años de Soledad", "1ra", "Gabriel Garcia Marquez");
        Libro l2 = new Libro("El Aleph", "2da", "Jorge Luis Borges");
        Libro l3 = new Libro("Ficciones", "1ra", "Jorge Luis Borges");
        Libro l4 = new Libro("El Túnel", "3ra", "Ernesto Sabato");

        miEstante.agregarLibro(l1);
        miEstante.agregarLibro(l2);
        miEstante.agregarLibro(l3);
        miEstante.agregarLibro(l4); 

        miEstante.mostrarEstante();

        miEstante.mostrarLibrosAutor("Jorge Luis Borges");

        System.out.println();
        miEstante.eliminarLibro("Cien Años de Soledad");
        miEstante.agregarLibro(l4);

        miEstante.mostrarEstante();
    }
}