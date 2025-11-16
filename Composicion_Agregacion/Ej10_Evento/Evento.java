package Ej10_Evento;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Evento {
    private String nombre;
    private List<Charla> C;
    private int nc;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.C = new ArrayList<>();
        this.nc = 0;
    }

    public void addCharla(Charla c) {
        if (nc < 50) {
            C.add(c);
            nc++;
        }
    }

    public double edadPromedioParticipantes() {
        int totalEdad = 0;
        int totalParticipantes = 0;
        for (Charla c : C) {
            for (Participante p : c.getParticipantes()) {
                totalEdad += p.getEdad();
                totalParticipantes++;
            }
        }
        return (totalParticipantes > 0) ? (double) totalEdad / totalParticipantes : 0;
    }

    public void buscarPersona(String nombre, String apellido) {
        String nombreCompleto = nombre + " " + apellido;
        boolean encontrado = false;
        for (Charla c : C) {
            if (c.getNombreCompletoSpeaker().equalsIgnoreCase(nombreCompleto)) {
                System.out.println(nombreCompleto + " es Speaker en la charla: " + c.getNombreCharla());
                encontrado = true;
            }
            for (Participante p : c.getParticipantes()) {
                if (p.getNombreCompleto().equalsIgnoreCase(nombreCompleto)) {
                    System.out.println(nombreCompleto + " es Participante en la charla: " + c.getNombreCharla());
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println(nombreCompleto + " no se encuentra en el evento.");
        }
    }

    public void eliminarCharlasSpeaker(int ci) {
        Iterator<Charla> iter = C.iterator();
        while (iter.hasNext()) {
            Charla c = iter.next();
            if (c.getCiSpeaker() == ci) {
                System.out.println("Eliminando charla: " + c.getNombreCharla() + " (Speaker CI: " + ci + ")");
                iter.remove();
                nc--;
            }
        }
    }
    
    public void ordenarCharlasPorParticipantes() {
        C.sort(Comparator.comparingInt(Charla::getNp));
        System.out.println("Charlas ordenadas por número de participantes (ascendente):");
        mostrarEvento();
    }

    public void mostrarEvento() {
        System.out.println("===== Evento: " + nombre + " (" + nc + " Charlas) =====");
        for (Charla c : C) {
            c.mostrar();
        }
        System.out.println("=========================================");
    }
}