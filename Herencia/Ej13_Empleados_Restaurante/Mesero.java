package Herencia.Ej13_Empleados_Restaurante;
public class Mesero extends Empleado {
    private double propina;
    private int horaExtra;
    private float sueldoHora;
    public Mesero(String nombre, float sueldoMes, double propina, int horaExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.propina = propina;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }
    @Override
    public float calcularSueldoTotal() {
        return (float) (this.sueldoMes + (this.horaExtra * this.sueldoHora) + this.propina);
    }
    @Override
    public void mostrar() {
        System.out.println("--- Empleado Mesero ---");
        super.mostrar();
        System.out.println("Propina: " + this.propina);
        System.out.println("Sueldo Total (con extras y propina): " + this.calcularSueldoTotal());
    }
}