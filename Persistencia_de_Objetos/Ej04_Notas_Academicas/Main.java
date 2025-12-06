package Ej04_Notas_Academicas;

public class Main {
    public static void main(String[] args) {
        ArchiNota an = new ArchiNota();
        Estudiante e1 = new Estudiante(1, "Luis", "Perez", "Mamani", 20);
        an.agregarNota(new Nota("Fisica", 90, e1));
        an.agregarNota(new Nota("Quimica", 50, e1));
        
        an.promedioTotal();
        System.out.println("Mejor nota:");
        an.mejorNota();
        
        an.eliminarPorMateria("Quimica");
    }
}