package Ej06_Biblioteca;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class GestorBiblioteca {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private List<Libro> libros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    public void guardarTodo() {
        guardar("libros.json", libros);
        guardar("clientes.json", clientes);
        guardar("prestamos.json", prestamos);
    }
    
    public void addLibro(Libro l) { libros.add(l); }
    public void addCliente(Cliente c) { clientes.add(c); }
    public void addPrestamo(Prestamo p) { prestamos.add(p); }

    private <T> void guardar(String file, List<T> list) {
        try(Writer w = new FileWriter(file)) { gson.toJson(list, w); } catch(IOException e){}
    }

    public void listarPreciosRango(double x, double y) {
        libros.stream().filter(l -> l.getPrecio() >= x && l.getPrecio() <= y).forEach(System.out::println);
    }

    public void librosNuncaVendidos() {
        Set<String> vendidos = prestamos.stream().map(Prestamo::getCodLibro).collect(Collectors.toSet());
        libros.stream().filter(l -> !vendidos.contains(l.getCodLibro())).forEach(System.out::println);
    }

    public void clientesDeLibro(String codLibro) {
        prestamos.stream()
            .filter(p -> p.getCodLibro().equals(codLibro))
            .map(p -> obtenerCliente(p.getCodCliente()))
            .filter(Objects::nonNull)
            .forEach(System.out::println);
    }
    
    private Cliente obtenerCliente(String id) {
        return clientes.stream().filter(c -> c.getCodCliente().equals(id)).findFirst().orElse(null);
    }

    public void libroMasPrestado() {
        Map<String, Integer> counts = new HashMap<>();
        for(Prestamo p : prestamos) counts.put(p.getCodLibro(), counts.getOrDefault(p.getCodLibro(), 0) + p.getCantidad());
        counts.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(e -> System.out.println("Libro ID mas prestado: " + e.getKey()));
    }
}