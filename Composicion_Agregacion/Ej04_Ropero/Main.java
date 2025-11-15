package Ej04_Ropero;

public class Main {
    public static void main(String[] args) {
        Ropero miRopero = new Ropero("Madera");

        miRopero.adicionarPrenda(new Ropa("Camisa", "Algodon"));
        miRopero.adicionarPrenda(new Ropa("Pantalon", "Jean"));
        miRopero.adicionarPrenda(new Ropa("Chamarra", "Cuero"));
        miRopero.adicionarPrenda(new Ropa("Camisa", "Seda"));

        miRopero.mostrarTodo();

        miRopero.mostrarPrendas("Camisa", "Algodon");

        System.out.println("\nEliminando prendas de Algodon o tipo Chamarra...");
        miRopero.eliminarPrenda("Chamarra", "Algodon");

        miRopero.mostrarTodo();
    }
}