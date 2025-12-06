package Ej09_Zoologico_Virtual;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private int id;
    private String nombre;
    private List<Animal> animales;

    public Zoologico(int id, String n) { this.id=id; this.nombre=n; this.animales=new ArrayList<>(); }
    public List<Animal> getAnimales() { return animales; }
    public int getId() { return id; }
    public void addAnimal(Animal a) { animales.add(a); }
    @Override public String toString() { return nombre + " Animales:" + animales.size(); }
}