package Ej13_Playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private List<Cancion> canciones;
    private int numeroCanciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
        this.numeroCanciones = 0;
    }

    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
        this.numeroCanciones++;
    }

    public void mostrarPlaylist() {
        System.out.println("=== Playlist: " + nombre + " (" + numeroCanciones + " canciones) ===");
        for (Cancion c : canciones) {
            c.mostrar();
        }
        System.out.println("========================================");
    }

    public void calcularDuracionTotal() {
        int totalSegundos = 0;
        for (Cancion c : canciones) {
            totalSegundos += c.getDuracionSegundos();
        }
        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        System.out.println("Duración total de '" + nombre + "': " + minutos + " minutos y " + segundos + " segundos.");
    }

    public void buscarPorArtista(String artista) {
        System.out.println("Canciones en la playlist del artista '" + artista + "':");
        boolean encontrado = false;
        for (Cancion c : canciones) {
            if (c.getArtista().equalsIgnoreCase(artista)) {
                c.mostrar();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("  (No se encontraron canciones de ese artista)");
        }
    }
}