package Herencia.Ej13_Empleados_Restaurante;
public class Empleado {
    protected String nombre;
    protected float sueldoMes;
    public Empleado(String nombre, float sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }
    public float getSueldoMes() {
        return this.sueldoMes;
    }
    public String getNombre() {
        return this.nombre;
    }
    public float calcularSueldoTotal() {
        return this.sueldoMes;
    }
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sueldo Base Mensual: " + this.sueldoMes);
    }
}