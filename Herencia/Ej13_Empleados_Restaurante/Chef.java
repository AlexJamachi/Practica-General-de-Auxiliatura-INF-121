package Herencia.Ej13_Empleados_Restaurante;
public class Chef extends Empleado {
    private int horaExtra;
    private String tipo;
    private float sueldoHora;
    public Chef(String nombre, float sueldoMes, String tipo, int horaExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.tipo = tipo;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }
    @Override
    public float calcularSueldoTotal() {
        return this.sueldoMes + (this.horaExtra * this.sueldoHora);
    }
    @Override
    public void mostrar() {
        System.out.println("--- Empleado Chef ---");
        super.mostrar();
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Sueldo Total (con extras): " + this.calcularSueldoTotal());
    }
}