package Ej10_Evento;

public class Main {
    public static void main(String[] args) {
        Evento techConf = new Evento("Tech Conference 2025");

        Speaker s1 = new Speaker("Ana", "Gomez", 35, 123, "IA");
        Speaker s2 = new Speaker("Luis", "Rojas", 42, 456, "Ciberseguridad");

        Charla c1 = new Charla("Audit. A", "IA Avanzada", s1);
        Charla c2 = new Charla("Audit. B", "Defensa Activa", s2);
        Charla c3 = new Charla("Audit. A", "IA en Negocios", s1);

        c1.addParticipante(new Participante("Juan", "Perez", 20, 111, 101));
        c1.addParticipante(new Participante("Maria", "Luna", 22, 222, 102));
        
        c2.addParticipante(new Participante("Carlos", "Soliz", 30, 333, 103));

        techConf.addCharla(c1);
        techConf.addCharla(c2);
        techConf.addCharla(c3);

        techConf.mostrarEvento();

        System.out.println("Edad promedio: " + techConf.edadPromedioParticipantes());

        techConf.buscarPersona("Maria", "Luna");
        techConf.buscarPersona("Ana", "Gomez");

        System.out.println("\n--- Eliminando charlas del Speaker 123 ---");
        techConf.eliminarCharlasSpeaker(123);
        techConf.mostrarEvento();
        
        techConf.addCharla(c1);
        System.out.println("\n--- Ordenando charlas ---");
        techConf.ordenarCharlasPorParticipantes();
    }
}