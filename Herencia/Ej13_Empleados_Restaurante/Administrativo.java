package Herencia.Ej13_Empleados_Restaurante;
public class Administrativo extends Empleado {
    private String cargo;
    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }
    @Override
    public void mostrar() {
        System.out.println("--- Empleado Administrativo ---");
        super.mostrar();
        System.out.println("Cargo: " + this.cargo);
    }
}