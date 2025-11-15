package Ej15_Estante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estante {
    private String tipoMaterial;
    private String tamanio;
    private int capacidadMaxima;
    private List<Libro> libros;

    public Estante(String tipoMaterial, String tamanio, int capacidadMaxima) {
        this.tipoMaterial = tipoMaterial;
        this.tamanio = tamanio;
        this.capacidadMaxima = capacidadMaxima;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libros.size() < capacidadMaxima) {
            libros.add(libro);
            System.out.println("Libro '" + libro.getTitulo() + "' agregado al estante.");
        } else {
            System.out.println("No se pudo agregar '" + libro.getTitulo() + "'. El estante está lleno.");
        }
    }

    public void eliminarLibro(String titulo) {
        Iterator<Libro> iter = libros.iterator();
        while (iter.hasNext()) {
            Libro l = iter.next();
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                iter.remove();
                System.out.println("Libro '" + titulo + "' eliminado del estante.");
                return;
            }
        }
        System.out.println("Libro '" + titulo + "' no encontrado en el estante.");
    }

    public void mostrarLibrosAutor(String autor) {
        System.out.println("Libros del autor '" + autor + "' en el estante:");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getNombreAutor().equalsIgnoreCase(autor)) {
                l.mostrar();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("  (No se encontraron libros de ese autor)");
        }
    }

    public void mostrarEstante() {
        System.out.println("\n--- Estante de " + tipoMaterial + " (" + tamanio + ") ---");
        System.out.println("Capacidad: " + libros.size() + "/" + capacidadMaxima);
        for (Libro l : libros) {
            l.mostrar();
        }
        System.out.println("----------------------------------------------");
    }
}