package Ej15_Estante;

public class Libro {
    private String titulo;
    private String edicion;
    private String nombreAutor;

    public Libro(String titulo, String edicion, String nombreAutor) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.nombreAutor = nombreAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void mostrar() {
        System.out.println("  - " + titulo + " (Autor: " + nombreAutor + ", Edición: " + edicion + ")");
    }
}