package Ej01_Charangos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArchivoCharango archivo = new ArchivoCharango();
        List<Charango> lista = new ArrayList<>();
        
        boolean[] c1 = {true, true, true, true, true, true, true, true, true, true};
        boolean[] c2 = {false, false, false, false, false, false, false, true, true, true}; 
        
        lista.add(new Charango("Madera", 10, c1));
        lista.add(new Charango("Plastico", 10, c2));
        lista.add(new Charango("Armadillo", 5, c1));

        archivo.guardar(lista);
        
        System.out.println("--- Buscar 10 cuerdas ---");
        archivo.buscar10Cuerdas();
        
        System.out.println("--- Eliminar defectuosos ---");
        archivo.eliminarDefectuosos();
        
        System.out.println("--- Ordenar por material ---");
        archivo.ordenarPorMaterial();
    }
}