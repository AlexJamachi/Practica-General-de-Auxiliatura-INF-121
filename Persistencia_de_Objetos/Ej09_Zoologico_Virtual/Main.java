package Ej09_Zoologico_Virtual;

public class Main {
    public static void main(String[] args) {
        ArchZoo az = new ArchZoo();
        Zoologico z1 = new Zoologico(1, "Municipal");
        z1.addAnimal(new Animal("Leon", "Simba", 1));
        Zoologico z2 = new Zoologico(2, "Privado");
        
        az.guardar(z1);
        az.guardar(z2);
        
        az.moverAnimales(1, 2);
    }
}