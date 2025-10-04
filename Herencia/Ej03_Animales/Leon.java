package Herencia.Ej03_Animales;
public class Leon extends Animal {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }    
    @Override
    public void desplazarse() {
        System.out.println("El león " + this.nombre + " está caminando sobre sus cuatro patas.");
    }
}