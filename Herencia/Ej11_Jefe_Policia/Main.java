package Herencia.Ej11_Jefe_Policia;
public class Main {
    public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Juan Carlos", "1122334", "JP-001", 15000.0, "Coronel", "Distrito Sur");
        JefePolicia jefe2 = new JefePolicia("Maria Luisa", "4455667", "JP-002", 15500.0, "Coronel", "Distrito Central");
        System.out.println("Jefes de Policía instanciados:");
        jefe1.mostrarDatos();
        jefe2.mostrarDatos();
        System.out.println("\n--- Verificación de Sueldo ---");
        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println(jefe1.getNombre() + " tiene el mayor sueldo.");
        } else if (jefe2.getSueldo() > jefe1.getSueldo()) {
            System.out.println(jefe2.getNombre() + " tiene el mayor sueldo.");
        } else {
            System.out.println("Ambos jefes tienen el mismo sueldo.");
        }
        System.out.println("\n--- Verificación de Rango ---");
        if (jefe1.getRango().equals(jefe2.getRango())) {
            System.out.println("Ambos jefes tienen el mismo rango: " + jefe1.getRango());
        } else {
            System.out.println("Los jefes tienen rangos diferentes.");
        }
    }
}