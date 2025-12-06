package Ej04_Notas_Academicas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArchiNota {
    private String nombreArchi = "notas.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void agregarNota(Nota n) {
        List<Nota> lista = listar();
        lista.add(n);
        guardar(lista);
    }

    private List<Nota> listar() {
        try (Reader r = new FileReader(nombreArchi)) {
            Type t = new TypeToken<ArrayList<Nota>>(){}.getType();
            List<Nota> l = gson.fromJson(r, t);
            return l != null ? l : new ArrayList<>();
        } catch (IOException e) { return new ArrayList<>(); }
    }

    private void guardar(List<Nota> lista) {
        try (Writer w = new FileWriter(nombreArchi)) {
            gson.toJson(lista, w);
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void promedioTotal() {
        List<Nota> lista = listar();
        double avg = lista.stream().mapToDouble(Nota::getNotaFinal).average().orElse(0);
        System.out.println("Promedio general: " + avg);
    }

    public void mejorNota() {
        List<Nota> lista = listar();
        double max = lista.stream().mapToDouble(Nota::getNotaFinal).max().orElse(0);
        lista.stream().filter(n -> n.getNotaFinal() == max).forEach(System.out::println);
    }

    public void eliminarPorMateria(String materia) {
        List<Nota> lista = listar();
        lista.removeIf(n -> n.getMateria().equalsIgnoreCase(materia));
        guardar(lista);
    }
}