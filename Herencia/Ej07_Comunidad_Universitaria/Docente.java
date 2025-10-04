package Herencia.Ej07_Comunidad_Universitaria;
public class Docente extends Persona {
    private double sueldo;
    private String regProfesional;
    public Docente(String n, String p, String m, int e, double s, String reg) {
        super(n, p, m, e);
        this.sueldo = s;
        this.regProfesional = reg;
    }
    @Override
    public void mostrar() {
        System.out.println("--- Datos del Docente ---");
        super.mostrar();
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("Registro Profesional: " + this.regProfesional);
        System.out.println("-------------------------");
    }
}