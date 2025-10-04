package Herencia.Ej03_Animales;
public class Pinguino extends Animal {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void desplazarse() {
        System.out.println("El pingüino " + this.nombre + " está nadando ágilmente en el agua.");
    }
}