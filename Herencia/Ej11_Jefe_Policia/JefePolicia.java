package Herencia.Ej11_Jefe_Policia;
public class JefePolicia extends Persona implements Empleado, Policia {
    private double sueldo;
    private String idEmpleado;
    private String rango;
    private String distritoACargo;
    public JefePolicia(String nombre, String ci, String idEmpleado, double sueldo, String rango, String distrito) {
        super(nombre, ci);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.rango = rango;
        this.distritoACargo = distrito;
    }
    @Override
    public double getSueldo() {
        return this.sueldo;
    }
    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String getRango() {
        return this.rango;
    }
    @Override
    public void setRango(String rango) {
        this.rango = rango;
    }
    public void mostrarDatos() {
        System.out.println("--- Jefe de Policía ---");
        System.out.println("Nombre: " + this.nombre + " (CI: " + this.ci + ")");
        System.out.println("ID Empleado: " + this.idEmpleado);
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("Rango: " + this.rango);
        System.out.println("Distrito a Cargo: " + this.distritoACargo);
        System.out.println("------------------------");
    }
}