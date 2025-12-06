package Ej03_Tienda_Productos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArchivoProducto {
    private String nomA;
    private Gson gson;

    public ArchivoProducto(String nombreArchivo) {
        this.nomA = nombreArchivo;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        crearArchivo();
    }

    public void crearArchivo() {
        File f = new File(nomA);
        if(!f.exists()) {
            try (Writer w = new FileWriter(f)) {
                gson.toJson(new ArrayList<Producto>(), w);
            } catch (IOException e) { e.printStackTrace(); }
        }
    }

    private List<Producto> leer() {
        try (Reader r = new FileReader(nomA)) {
            Type t = new TypeToken<ArrayList<Producto>>(){}.getType();
            List<Producto> l = gson.fromJson(r, t);
            return l != null ? l : new ArrayList<>();
        } catch (IOException e) { return new ArrayList<>(); }
    }

    private void guardar(List<Producto> lista) {
        try (Writer w = new FileWriter(nomA)) {
            gson.toJson(lista, w);
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void guardaProducto(Producto p) {
        List<Producto> lista = leer();
        lista.add(p);
        guardar(lista);
    }

    public Producto buscaProducto(int codigo) {
        return leer().stream()
                .filter(p -> p.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public void calcularPromedio() {
        List<Producto> lista = leer();
        double avg = lista.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
        System.out.println("Promedio de precios: " + avg);
    }

    public void mostrarMasCaro() {
        leer().stream()
            .max(Comparator.comparingDouble(Producto::getPrecio))
            .ifPresent(System.out::println);
    }
}