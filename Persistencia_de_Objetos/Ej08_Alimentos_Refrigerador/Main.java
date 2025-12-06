package Ej08_Alimentos_Refrigerador;

public class Main {
    public static void main(String[] args) {
        ArchRefri ar = new ArchRefri();
        ar.guardar(new Alimento("Leche", "01/01/2024", 2));
        ar.guardar(new Alimento("Huevo", "10/12/2025", 0));
        
        ar.verCaducados("01/06/2024");
        ar.eliminarCantidadCero();
        ar.masCantidad();
    }
}