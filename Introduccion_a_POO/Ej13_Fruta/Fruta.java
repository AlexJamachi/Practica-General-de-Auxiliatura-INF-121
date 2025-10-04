package Introduccion_a_POO.Ej13_Fruta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Fruta implements Comparable<Fruta> {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private ArrayList<String> vitaminas;
    public Fruta() {
        this.nombre = "Desconocido";
        this.tipo = "Desconocido";
        this.vitaminas = new ArrayList<>();
        this.nroVitaminas = 0;
    }
    public Fruta(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vitaminas = new ArrayList<>();
        this.nroVitaminas = 0;
    }
    public Fruta(String nombre, String tipo, String[] vits) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vitaminas = new ArrayList<>(Arrays.asList(vits));
        this.nroVitaminas = vits.length;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNroVitaminas() {
        return nroVitaminas;
    }
    public void agregarVitamina(String vitamina) {
        this.vitaminas.add(vitamina);
        this.nroVitaminas = this.vitaminas.size();
    }
    public void mostrarVitaminas() {
        System.out.println("Vitaminas de " + this.nombre + ": " + String.join(", ", this.vitaminas));
    }
    public boolean tieneVitaminaC() {
        for (String vit : this.vitaminas) {
            if (vit.equalsIgnoreCase("C")) {
                return true;
            }
        }
        return false;
    }
    public void mostrarDatosCompletos() {
        System.out.println("-> Fruta: " + nombre + " (Tipo: " + tipo + ")");
        System.out.println("   Cantidad de Vitaminas: " + nroVitaminas);
        System.out.println("   Vitaminas: " + String.join(", ", this.vitaminas));
    }
    @Override
    public int compareTo(Fruta otra) {
        if (this.vitaminas.isEmpty() && otra.vitaminas.isEmpty()) {
            return 0;
        }
        if (this.vitaminas.isEmpty()) {
            return -1;
        }
        if (otra.vitaminas.isEmpty()) {
            return 1;
        }
        return this.vitaminas.get(0).compareTo(otra.vitaminas.get(0));
    }
    public static void main(String[] args) {
        Fruta fruta1 = new Fruta("Naranja", "Cítrico", new String[]{"C", "A", "B1"});
        Fruta fruta2 = new Fruta("Manzana", "Pomo");
        fruta2.agregarVitamina("E");
        fruta2.agregarVitamina("K");
        Fruta fruta3 = new Fruta();
        fruta3.nombre = "Fresa";
        fruta3.tipo = "Baya";
        fruta3.agregarVitamina("C");
        fruta3.agregarVitamina("B9");
        fruta3.agregarVitamina("K");
        ArrayList<Fruta> canasta = new ArrayList<>(Arrays.asList(fruta1, fruta2, fruta3));
        System.out.println("--- Frutas Creadas ---");
        for(Fruta f : canasta) {
            f.mostrarDatosCompletos();
        }
        Fruta masVitaminas = Collections.max(canasta, Comparator.comparing(Fruta::getNroVitaminas));
        System.out.println("\n--- Fruta con más vitaminas ---");
        System.out.println(masVitaminas.getNombre() + " con " + masVitaminas.getNroVitaminas() + " vitaminas.");
        System.out.println("\n--- Vitaminas de la Manzana ---");
        for (Fruta f : canasta) {
            if (f.getNombre().equals("Manzana")) {
                f.mostrarVitaminas();
            }
        }
        int contadorC = 0;
        for (Fruta f : canasta) {
            if (f.tieneVitaminaC()) {
                contadorC++;
            }
        }
        System.out.println("\n--- Conteo de Vitamina C ---");
        System.out.println("Hay " + contadorC + " frutas con vitamina C.");
        Collections.sort(canasta);
        System.out.println("\n--- Frutas ordenadas por su primera vitamina ---");
        for(Fruta f : canasta) {
            f.mostrarDatosCompletos();
        }
    }
}