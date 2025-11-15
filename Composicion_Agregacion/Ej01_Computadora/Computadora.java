package Ej01_Computadora;

public class Computadora {
    private int anioEnsamblaje;
    private RAM ram;
    private DiscoDuro disco;

    public Computadora(int anioEnsamblaje, int capRam, String marcaRam, String tipoRam, int capDisco, String marcaDisco, String modeloDisco) {
        this.anioEnsamblaje = anioEnsamblaje;
        this.ram = new RAM(capRam, marcaRam, tipoRam);
        this.disco = new DiscoDuro(capDisco, marcaDisco, modeloDisco);
    }

    public Computadora(int anioEnsamblaje, RAM ram, DiscoDuro disco) {
        this.anioEnsamblaje = anioEnsamblaje;
        this.ram = ram;
        this.disco = disco;
    }
    
    public Computadora() {
        this.anioEnsamblaje = 2025;
        this.ram = new RAM(8, "Kingston", "DDR4");
        this.disco = new DiscoDuro(500, "Seagate", "HDD");
    }

    public void encender() {
        System.out.println("Computadora " + anioEnsamblaje + " encendiendo...");
    }

    public void mostrar() {
        System.out.println("--- Computadora " + anioEnsamblaje + " ---");
        ram.mostrar();
        disco.mostrar();
        System.out.println("---------------------------");
    }

    public void modificarCapacidadRam(int nuevaCapacidad) {
        ram.setCapacidad(nuevaCapacidad);
        System.out.println("Capacidad de RAM modificada a " + nuevaCapacidad + "GB.");
    }

    public void modificarCapacidadDisco(int nuevaCapacidad) {
        disco.setCapacidad(nuevaCapacidad);
        System.out.println("Capacidad de Disco modificada a " + nuevaCapacidad + "GB.");
    }
}