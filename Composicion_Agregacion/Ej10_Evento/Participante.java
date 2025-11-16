package Ej10_Evento;

public class Participante extends Persona {
    private int nroTicket;

    public Participante(String nombre, String apellido, int edad, int ci, int nroTicket) {
        super(nombre, apellido, edad, ci);
        this.nroTicket = nroTicket;
    }

    public void mostrar() {
        System.out.println("    - Participante: " + getNombreCompleto() + " (Ticket: " + nroTicket + ")");
    }
}