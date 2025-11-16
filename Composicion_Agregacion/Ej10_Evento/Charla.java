package Ej10_Evento;
import java.util.ArrayList;
import java.util.List;

public class Charla {
    private String lugar;
    private String nombreCharla;
    private Speaker S;
    private List<Participante> P;
    private int np;

    public Charla(String lugar, String nombreCharla, Speaker S) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.S = S;
        this.P = new ArrayList<>();
        this.np = 0;
    }

    public void addParticipante(Participante p) {
        if (np < 50) {
            P.add(p);
            np++;
        } else {
            System.out.println("Charla llena, no se puede agregar más participantes.");
        }
    }

    public int getCiSpeaker() {
        return S.getCi();
    }
    
    public String getNombreCharla() {
        return nombreCharla;
    }

    public String getNombreCompletoSpeaker() {
        return S.getNombreCompleto();
    }
    
    public List<Participante> getParticipantes() {
        return P;
    }

    public int getNp() {
        return np;
    }

    public void mostrar() {
        System.out.println("\n  Charla: " + nombreCharla + " (Lugar: " + lugar + ")");
        S.mostrar();
        System.out.println("  Participantes (" + np + "):");
        for (Participante p : P) {
            p.mostrar();
        }
    }
}