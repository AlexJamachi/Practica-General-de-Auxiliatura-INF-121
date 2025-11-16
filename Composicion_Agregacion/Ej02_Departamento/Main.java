package Ej02_Departamento;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", "Gerente", 8000);
        Empleado e2 = new Empleado("Juan", "Analista", 5000);
        Empleado e3 = new Empleado("Luis", "Programador", 4000);
        Empleado e4 = new Empleado("Maria", "Contadora", 4500);
        Empleado e5 = new Empleado("Pedro", "Soporte", 3000);

        Departamento dep1 = new Departamento("Tecnología", "IT");
        dep1.addEmpleado(e1);
        dep1.addEmpleado(e2);
        dep1.addEmpleado(e3);
        dep1.addEmpleado(e4);
        dep1.addEmpleado(e5);

        Departamento dep2 = new Departamento("Ventas", "Comercial");

        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();

        dep1.cambioSalario(0.10);
        dep1.mostrarEmpleados();

        System.out.println("Buscando a 'Luis' en Dep1: " + dep1.buscarEmpleado(e3));
        System.out.println("Buscando a 'Luis' en Dep2: " + dep2.buscarEmpleado(e3));

        dep1.moverEmpleados(dep2);

        System.out.println("\n--- Después de Mover ---");
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();
    }
}