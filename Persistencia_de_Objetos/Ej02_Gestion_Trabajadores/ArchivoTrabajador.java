package Ej02_Gestion_Trabajadores;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArchivoTrabajador {
    private String nombreArch = "trabajadores.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArchivoTrabajador() {
        crearArchivo();
    }

    public void crearArchivo() {
        File file = new File(nombreArch);
        if (!file.exists()) {
            try (Writer writer = new FileWriter(file)) {
                gson.toJson(new ArrayList<Trabajador>(), writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Trabajador> leer() {
        try (Reader reader = new FileReader(nombreArch)) {
            Type listType = new TypeToken<ArrayList<Trabajador>>(){}.getType();
            List<Trabajador> lista = gson.fromJson(reader, listType);
            return lista != null ? lista : new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void escribir(List<Trabajador> lista) {
        try (Writer writer = new FileWriter(nombreArch)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarTrabajador(Trabajador t) {
        List<Trabajador> lista = leer();
        lista.add(t);
        escribir(lista);
    }

    public void aumentarSalario(int aumento, Trabajador t) {
        List<Trabajador> lista = leer();
        for (Trabajador trab : lista) {
            if (trab.getCarnet() == t.getCarnet()) {
                trab.setSalario(trab.getSalario() + aumento);
            }
        }
        escribir(lista);
    }

    public void buscarMayorSalario() {
        List<Trabajador> lista = leer();
        lista.stream()
            .max(Comparator.comparingDouble(Trabajador::getSalario))
            .ifPresent(System.out::println);
    }

    public void ordenarPorSalario() {
        List<Trabajador> lista = leer();
        lista.sort(Comparator.comparingDouble(Trabajador::getSalario));
        escribir(lista);
        lista.forEach(System.out::println);
    }
}