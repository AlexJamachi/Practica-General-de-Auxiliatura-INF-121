package Ej04_Notas_Academicas;

public class Nota {
    private String materia;
    private double notaFinal;
    private Estudiante estudiante;

    public Nota(String materia, double notaFinal, Estudiante estudiante) {
        this.materia = materia;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
    }

    public double getNotaFinal() { return notaFinal; }
    public String getMateria() { return materia; }
    public Estudiante getEstudiante() { return estudiante; }

    @Override
    public String toString() {
        return "Mat: " + materia + " Nota: " + notaFinal + " Est: " + estudiante;
    }
}