package Herencia.Ej13_Empleados_Restaurante;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> personal = new ArrayList<>();
        personal.add(new Chef("Gustavo Fring", 12000f, "Chef Principal", 10, 80f));
        personal.add(new Mesero("Ana Paredes", 4500f, 800.0, 5, 40f));
        personal.add(new Mesero("Luis Calvo", 4500f, 650.0, 8, 40f));
        personal.add(new Administrativo("Maria Lopez", 6000f, "Contadora"));
        personal.add(new Administrativo("Carlos Pinto", 6000f, "Recursos Humanos"));
        System.out.println("--- Personal del Restaurante 'Ratatouille' ---\n");
        for (Empleado e : personal) {
            e.mostrar();
            System.out.println();
        }
        float sueldoBuscado = 6000f;
        System.out.println("\n--- Empleados con sueldo base de " + sueldoBuscado + " ---");
        for (Empleado e : personal) {
            if (e.getSueldoMes() == sueldoBuscado) {
                System.out.println("- " + e.getNombre());
            }
        }
    }
}