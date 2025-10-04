package Polimorfismo.Ej13_Mp4;
import java.util.ArrayList;
public class Mp4 {
    private String marca;
    private double capacidadGb;
    private ArrayList<Cancion> canciones;
    private ArrayList<Video> videos;
    public Mp4(String marca, double capacidadGb) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.canciones = new ArrayList<>();
        this.videos = new ArrayList<>();
    }
    public void agregar(Cancion cancion) {
        this.canciones.add(cancion);
        System.out.println("Canción '" + cancion.nombre + "' agregada.");
    }
    public void agregar(Video video) {
        this.videos.add(video);
        System.out.println("Video '" + video.nombre + "' agregado.");
    }
    public void borrarCancion(String nombre) {
        if (canciones.removeIf(c -> c.nombre.equalsIgnoreCase(nombre))) {
            System.out.println("Canción(es) con nombre '" + nombre + "' borrada(s).");
        }
    }
    public void borrarCancionPorArtista(String artista) {
        if (canciones.removeIf(c -> c.artista.equalsIgnoreCase(artista))) {
             System.out.println("Canción(es) del artista '" + artista + "' borrada(s).");
        }
    }
    public void borrarCancion(String nombre, double pesoKb) {
        if (canciones.removeIf(c -> c.nombre.equalsIgnoreCase(nombre) && c.pesoKb == pesoKb)) {
             System.out.println("Canción '" + nombre + "' con peso " + pesoKb + "KB borrada.");
        }
    }
    public void mostrarCapacidadDisponible() {
        double espacioOcupadoGb = 0;
        for (Cancion c : canciones) {
            espacioOcupadoGb += c.pesoKb / (1024 * 1024); // KB a GB
        }
        for (Video v : videos) {
            espacioOcupadoGb += v.pesoMb / 1024; // MB a GB
        }
        double disponible = capacidadGb - espacioOcupadoGb;
        System.out.printf("\nCapacidad Total: %.2f GB\n", capacidadGb);
        System.out.printf("Espacio Disponible: %.2f GB\n", disponible);
    }
    public void mostrarContenido() {
        System.out.println("\n--- Contenido del MP4 " + marca + " ---");
        System.out.println("Canciones:");
        for(Cancion c : canciones) System.out.println("  - " + c.nombre + " de " + c.artista);
        System.out.println("Videos:");
        for(Video v : videos) System.out.println("  - " + v.nombre + " de " + v.artista);
    }
    public static void main(String[] args) {
        Mp4 miReproductor = new Mp4("Sony Walkman", 8.0);
        miReproductor.agregar(new Cancion("Back To Black", "Amy Winehouse", 100));
        miReproductor.agregar(new Cancion("Lost On You", "LP", 150));
        miReproductor.agregar(new Cancion("Another Love", "Tom Odell", 120));
        miReproductor.agregar(new Video("Heathens", "twenty one pilots", 50));
        miReproductor.mostrarContenido();
        miReproductor.mostrarCapacidadDisponible();
        System.out.println("\n--- Borrando contenido ---");
        miReproductor.borrarCancion("Lost On You");
        miReproductor.mostrarContenido();
    }
}