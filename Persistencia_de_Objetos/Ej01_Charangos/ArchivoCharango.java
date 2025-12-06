package Ej01_Charangos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArchivoCharango {
    private String ruta = "charangos.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardar(List<Charango> lista) {
        try (Writer writer = new FileWriter(ruta)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Charango> listar() {
        try (Reader reader = new FileReader(ruta)) {
            Type listType = new TypeToken<ArrayList<Charango>>(){}.getType();
            List<Charango> lista = gson.fromJson(reader, listType);
            return lista != null ? lista : new ArrayList<>();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void eliminarDefectuosos() {
        List<Charango> lista = listar();
        lista.removeIf(c -> c.contarCuerdasFalsas() > 6);
        guardar(lista);
    }

    public void listarPorMaterial(String material) {
        List<Charango> lista = listar();
        lista.stream()
            .filter(c -> c.getMaterial().equalsIgnoreCase(material))
            .forEach(System.out::println);
    }

    public void buscar10Cuerdas() {
        List<Charango> lista = listar();
        lista.stream()
            .filter(c -> c.getNroCuerdas() == 10)
            .forEach(System.out::println);
    }

    public void ordenarPorMaterial() {
        List<Charango> lista = listar();
        lista.sort(Comparator.comparing(Charango::getMaterial));
        guardar(lista);
        lista.forEach(System.out::println);
    }
}