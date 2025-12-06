package Ej07_Salud_Infantil;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ArchNiño {
    private String na = "ninos.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void agregar(Niño n) {
        List<Niño> l = listar();
        l.add(n);
        try(Writer w = new FileWriter(na)) { gson.toJson(l, w); } catch(IOException e){}
    }

    public List<Niño> listar() {
        try(Reader r = new FileReader(na)) {
            Type t = new TypeToken<ArrayList<Niño>>(){}.getType();
            List<Niño> l = gson.fromJson(r, t);
            return l!=null?l:new ArrayList<>();
        } catch(IOException e){ return new ArrayList<>(); }
    }

    public void contarPesoAdecuado() {
        long count = listar().stream().filter(n -> (n.getPeso()/n.getTalla()) > 2.0).count(); 
        System.out.println("Niños peso 'adecuado' (Logica dummy): " + count);
    }

    public void promedioEdad() {
        listar().stream().mapToInt(Niño::getEdad).average().ifPresent(a -> System.out.println("Promedio edad: " + a));
    }

    public void buscarCarnet(int x) {
        listar().stream().filter(n -> n.getCarnet() == x).forEach(System.out::println);
    }
}