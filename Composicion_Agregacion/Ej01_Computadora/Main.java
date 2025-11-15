package Ej01_Computadora;

public class Main {
    public static void main(String[] args) {
        Computadora c1 = new Computadora(2024, 16, "Corsair", "DDR5", 1000, "Samsung", "SSD");
        Computadora c2 = new Computadora();
        
        RAM ram3 = new RAM(32, "Crucial", "DDR4");
        DiscoDuro disco3 = new DiscoDuro(2000, "WD", "HDD");
        Computadora c3 = new Computadora(2023, ram3, disco3);

        c1.encender();
        c1.mostrar();

        c2.mostrar();
        c2.modificarCapacidadRam(100); 
        c2.mostrar();

        c3.mostrar();
        c3.modificarCapacidadDisco(4000);
        c3.mostrar();
    }
}
