package Ej07_Salud_Infantil;

public class Main {
    public static void main(String[] args) {
        ArchNiño an = new ArchNiño();
        an.agregar(new Niño("Josue", 5, 20.0, 1.1, 12345));
        an.promedioEdad();
        an.buscarCarnet(12345);
    }
}