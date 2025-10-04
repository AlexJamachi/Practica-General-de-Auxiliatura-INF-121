package Introduccion_a_POO.Ej07_Mascota;
public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;
    public Mascota(String nombre, String tipo, int energia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = Math.max(0, Math.min(100, energia));
    }
    public void alimentar() {
        System.out.println("Alimentando a " + this.nombre + "...");
        this.energia = Math.min(100, this.energia + 20);
        this.mostrarEnergia();
    }
    public void jugar() {
        System.out.println("Jugando con " + this.nombre + "...");
        this.energia = Math.max(0, this.energia - 15);
        this.mostrarEnergia();
    }
    public void mostrarEnergia() {
        System.out.println("Energía de " + this.nombre + ": " + this.energia + "/100");
    }
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Rocky", "Perro", 60);
        Mascota mascota2 = new Mascota("Mishi", "Gato", 40);
        System.out.println("--- Simulación de Mascotas ---\n");
        mascota1.mostrarEnergia();
        mascota2.mostrarEnergia();
        System.out.println("");
        mascota1.jugar();
        mascota2.alimentar();
        System.out.println("");
        mascota1.jugar();
        mascota2.jugar();
        System.out.println("");
        mascota1.alimentar();
        mascota2.alimentar();
        System.out.println("\n--- Fin de la Simulación ---");
    }
}