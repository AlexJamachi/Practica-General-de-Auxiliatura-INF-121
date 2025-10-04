package Polimorfismo.Ej02_Videojuego;
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "PC";
        this.cantidadJugadores = 1;
    }
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se agregó un jugador a " + this.nombre + ". Total: " + this.cantidadJugadores);
    }
    public void agregarJugadores(int cantidad) {
        if (cantidad > 0) {
            this.cantidadJugadores += cantidad;
            System.out.println("Se agregaron " + cantidad + " jugadores a " + this.nombre + ". Total: " + this.cantidadJugadores);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }
    public void mostrar() {
        System.out.println("--- Videojuego ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Jugadores: " + this.cantidadJugadores);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("The Witcher 3", "PC", 1);
        Videojuego juego2 = new Videojuego("Minecraft", "Multiplataforma");
        System.out.println("Juegos instanciados:");
        juego1.mostrar();
        juego2.mostrar();
        System.out.println("\nAgregando jugadores a Minecraft:");
        juego2.agregarJugadores();
        juego2.agregarJugadores(5);
        System.out.println("\nEstado final de Minecraft:");
        juego2.mostrar();
    }
}