package Ej08_Alimentos_Refrigerador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArchRefri {
    private String file = "refri.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardar(Alimento a) {
        List<Alimento> l = leer();
        l.add(a);
        escribir(l);
    }

    private List<Alimento> leer() {
        try(Reader r = new FileReader(file)) {
            Type t = new TypeToken<ArrayList<Alimento>>(){}.getType();
            List<Alimento> l = gson.fromJson(r, t);
            return l!=null?l:new ArrayList<>();
        } catch(IOException e){ return new ArrayList<>(); }
    }
    private void escribir(List<Alimento> l) {
        try(Writer w = new FileWriter(file)) { gson.toJson(l, w); } catch(IOException e){}
    }

    public void verCaducados(String fechaLimite) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate limite = LocalDate.parse(fechaLimite, dtf);
        leer().stream().filter(a -> LocalDate.parse(a.getFechaVencimiento(), dtf).isBefore(limite))
              .forEach(System.out::println);
    }

    public void eliminarCantidadCero() {
        List<Alimento> l = leer();
        l.removeIf(a -> a.getCantidad() == 0);
        escribir(l);
    }

    public void masCantidad() {
        leer().stream().max(Comparator.comparingInt(Alimento::getCantidad)).ifPresent(System.out::println);
    }
}