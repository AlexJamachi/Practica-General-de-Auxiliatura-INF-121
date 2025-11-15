package Ej13_Playlist;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracionSegundos;

    public Cancion(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void mostrar() {
        System.out.println("  - " + titulo + " por " + artista + " (" + (duracionSegundos / 60) + "m " + (duracionSegundos % 60) + "s)");
    }
}