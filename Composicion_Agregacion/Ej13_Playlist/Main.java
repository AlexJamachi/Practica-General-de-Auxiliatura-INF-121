package Ej13_Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist miPlaylist = new Playlist("Favoritas");

        miPlaylist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen", 354));
        miPlaylist.agregarCancion(new Cancion("Hotel California", "Eagles", 391));
        miPlaylist.agregarCancion(new Cancion("Stairway to Heaven", "Led Zeppelin", 482));
        miPlaylist.agregarCancion(new Cancion("Another One Bites the Dust", "Queen", 215));

        miPlaylist.mostrarPlaylist();
        miPlaylist.calcularDuracionTotal();
        System.out.println();
        miPlaylist.buscarPorArtista("Queen");
        System.out.println();
        miPlaylist.buscarPorArtista("Metallica");
    }
}