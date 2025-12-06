package Ej09_Zoologico_Virtual;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArchZoo {
    private String f = "zoos.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardar(Zoologico z) {
        List<Zoologico> l = listar();
        l.add(z);
        escribir(l);
    }
    
    private List<Zoologico> listar() {
        try(Reader r = new FileReader(f)) {
            Type t = new TypeToken<ArrayList<Zoologico>>(){}.getType();
            List<Zoologico> l = gson.fromJson(r, t);
            return l!=null?l:new ArrayList<>();
        } catch(IOException e){ return new ArrayList<>(); }
    }
    private void escribir(List<Zoologico> l) {
        try(Writer w = new FileWriter(f)) { gson.toJson(l, w); } catch(IOException e){}
    }

    public void mayorVariedad() {
        listar().stream()
            .max(Comparator.comparingInt(z -> z.getAnimales().size()))
            .ifPresent(System.out::println);
    }

    public void moverAnimales(int idOrigen, int idDest) {
        List<Zoologico> zoos = listar();
        Zoologico org = null, dest = null;
        for(Zoologico z : zoos) {
            if(z.getId()==idOrigen) org = z;
            if(z.getId()==idDest) dest = z;
        }
        if(org!=null && dest!=null) {
            dest.getAnimales().addAll(org.getAnimales());
            org.getAnimales().clear();
            escribir(zoos);
        }
    }
}