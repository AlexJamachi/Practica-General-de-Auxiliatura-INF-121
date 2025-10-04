package Herencia.Ej07_Comunidad_Universitaria;
public class Estudiante extends Persona {
    private String ru;
    private String matricula;
    public Estudiante(String n, String p, String m, int e, String ru, String mat) {
        super(n, p, m, e);
        this.ru = ru;
        this.matricula = mat;
    }
    @Override
    public void mostrar() {
        System.out.println("--- Datos del Estudiante ---");
        super.mostrar();
        System.out.println("RU: " + this.ru);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("--------------------------");
    }
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
        }
    }
}