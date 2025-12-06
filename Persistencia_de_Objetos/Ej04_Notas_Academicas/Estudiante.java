package Ej04_Notas_Academicas;

public class Estudiante {
    private int ru;
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;

    public Estudiante(int ru, String nombre, String paterno, String materno, int edad) {
        this.ru = ru;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return nombre + " " + paterno;
    }
}