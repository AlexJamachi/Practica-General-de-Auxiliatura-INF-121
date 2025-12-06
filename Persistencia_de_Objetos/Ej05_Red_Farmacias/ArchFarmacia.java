package Ej05_Red_Farmacias;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArchFarmacia {
    private String na = "farmacias.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void adicionar(Farmacia f) {
        List<Farmacia> list = listar();
        list.add(f);
        guardar(list);
    }

    private List<Farmacia> listar() {
        try (Reader r = new FileReader(na)) {
            Type t = new TypeToken<ArrayList<Farmacia>>(){}.getType();
            List<Farmacia> l = gson.fromJson(r, t);
            return l != null ? l : new ArrayList<>();
        } catch (IOException e) { return new ArrayList<>(); }
    }

    private void guardar(List<Farmacia> l) {
        try (Writer w = new FileWriter(na)) { gson.toJson(l, w); } 
        catch (IOException e) { e.printStackTrace(); }
    }

    public void mostrarTosSucursal(int suc) {
        listar().stream()
            .filter(f -> f.getSucursal() == suc)
            .flatMap(f -> f.getMedicamentos().stream())
            .filter(m -> m.getTipo().equalsIgnoreCase("Tos"))
            .forEach(System.out::println);
    }

    public void buscarPorTipo(String tipo) {
        listar().stream()
            .flatMap(f -> f.getMedicamentos().stream())
            .filter(m -> m.getTipo().equalsIgnoreCase(tipo))
            .forEach(System.out::println);
    }

    public void ordenarPorDireccion() {
        List<Farmacia> l = listar();
        l.sort(Comparator.comparing(Farmacia::getDireccion));
        l.forEach(System.out::println);
    }

    public void moverMedicamentos(String tipo, int sucOrigen, int sucDestino) {
        List<Farmacia> farmacias = listar();
        Farmacia origen = null, destino = null;
        for(Farmacia f : farmacias) {
            if(f.getSucursal() == sucOrigen) origen = f;
            if(f.getSucursal() == sucDestino) destino = f;
        }

        if(origen != null && destino != null) {
            List<Medicamento> mover = origen.getMedicamentos().stream()
                .filter(m -> m.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
            
            origen.getMedicamentos().removeAll(mover);
            destino.getMedicamentos().addAll(mover);
            guardar(farmacias);
        }
    }
}