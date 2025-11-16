package Ej02_Departamento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Departamento {
    private String nombre;
    private String area;
    private List<Empleado> empleados;

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void mostrarEmpleados() {
        System.out.println("--- Departamento: " + nombre + " (Area: " + area + ") ---");
        System.out.println("Empleados (" + empleados.size() + "):");
        if (empleados.isEmpty()) {
            System.out.println("  (Sin empleados)");
        }
        for (Empleado e : empleados) {
            e.mostrar();
        }
        System.out.println("------------------------------------------");
    }

    public void cambioSalario(double porcentajeAumento) {
        System.out.println("Aplicando aumento de " + (porcentajeAumento * 100) + "% a " + nombre);
        for (Empleado e : empleados) {
            double nuevoSueldo = e.getSueldo() * (1 + porcentajeAumento);
            e.setSueldo(nuevoSueldo);
        }
    }

    public boolean buscarEmpleado(Empleado empleadoBuscado) {
        for (Empleado e : empleados) {
            if (e.getNombre().equals(empleadoBuscado.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void moverEmpleados(Departamento destino) {
        System.out.println("Moviendo empleados de " + this.nombre + " a " + destino.nombre);
        Iterator<Empleado> iter = this.empleados.iterator();
        while (iter.hasNext()) {
            Empleado e = iter.next();
            destino.addEmpleado(e);
            iter.remove();
        }
    }
}