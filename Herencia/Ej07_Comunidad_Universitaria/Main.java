package Herencia.Ej07_Comunidad_Universitaria;
import java.util.ArrayList;
public class Main {
    public static double promedioEdadEstudiantes(ArrayList<Estudiante> lista) {
        if (lista.isEmpty()) return 0;
        double suma = 0;
        for (Estudiante e : lista) {
            suma += e.getEdad();
        }
        return suma / lista.size();
    }
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", "Quispe", "Sosa", 20, "200012345", "MAT-123");
        Estudiante e2 = new Estudiante("Juan", "Perez", "Lara", 22, "200054321", "FIS-456");
        Docente docente = new Docente("Carlos", "Rojas", "Mendoza", 45, 8500.0, "PROF-789");
        e1.mostrar();
        e2.mostrar();
        docente.mostrar();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        System.out.printf("\nEl promedio de edad de los estudiantes es: %.2f años.\n", promedioEdadEstudiantes(estudiantes));
        System.out.println("\nModificando edad de " + e1.nombre + " a 21...");
        e1.modificarEdad(21);
        e1.mostrar();
        System.out.println("\nVerificando si algún estudiante tiene la misma edad que el docente...");
        for (Estudiante est : estudiantes) {
            if (est.getEdad() == docente.getEdad()) {
                System.out.println("El estudiante " + est.nombre + " tiene la misma edad que el docente.");
            } else {
                System.out.println("El estudiante " + est.nombre + " NO tiene la misma edad que el docente.");
            }
        }
    }
}