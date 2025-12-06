package Ej10_Videojuego_Estrategia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ArchivoJuego {
    private String archivo = "jugadores.txt";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardarJugador(Jugador j) {
        List<Jugador> lista = leer();
        lista.add(j);
        try(Writer w = new FileWriter(archivo)) {
            gson.toJson(lista, w);
        } catch(IOException e) { e.printStackTrace(); }
    }

    private List<Jugador> leer() {
        try(Reader r = new FileReader(archivo)) {
            Type t = new TypeToken<ArrayList<Jugador>>(){}.getType();
            List<Jugador> l = gson.fromJson(r, t);
            return l != null ? l : new ArrayList<>();
        } catch(IOException e) { return new ArrayList<>(); }
    }

    public void mostrarTodos() {
        leer().forEach(System.out::println);
    }

    public void buscarPorNombre(String nombre) {
        leer().stream()
            .filter(j -> j.getNombre().equalsIgnoreCase(nombre))
            .forEach(System.out::println);
    }
}