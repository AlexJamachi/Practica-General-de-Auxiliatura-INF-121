package Herencia.Ej03_Animales;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Leon("Simba", 5));
        animales.add(new Pinguino("Kowalski", 3));
        animales.add(new Canguro("Jack", 4));        
        System.out.println("--- Demostración de desplazamiento polimórfico ---");
        for (Animal animal : animales) {
            animal.desplazarse();
        }
    }
}