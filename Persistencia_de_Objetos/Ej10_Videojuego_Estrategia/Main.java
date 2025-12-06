package Ej10_Videojuego_Estrategia;

public class Main {
    public static void main(String[] args) {
        ArchivoJuego aj = new ArchivoJuego();
        aj.guardarJugador(new Jugador("Slayer", 55, 9000));
        aj.guardarJugador(new Jugador("Noob", 1, 0));

        System.out.println("--- Todos ---");
        aj.mostrarTodos();

        System.out.println("--- Busqueda ---");
        aj.buscarPorNombre("Slayer");
    }
}