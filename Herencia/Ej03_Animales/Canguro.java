package Herencia.Ej03_Animales;
public class Canguro extends Animal {
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }    
    @Override
    public void desplazarse() {
        System.out.println("El canguro " + this.nombre + " está saltando por la pradera.");
    }
}