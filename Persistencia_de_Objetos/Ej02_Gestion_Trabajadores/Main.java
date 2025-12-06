package Ej02_Gestion_Trabajadores;

public class Main {
    public static void main(String[] args) {
        ArchivoTrabajador arch = new ArchivoTrabajador();
        Trabajador t1 = new Trabajador("Juan", 123, 2000);
        Trabajador t2 = new Trabajador("Ana", 456, 3000);
        
        arch.guardarTrabajador(t1);
        arch.guardarTrabajador(t2);
        
        arch.aumentarSalario(500, t1);
        
        System.out.println("Mayor Salario:");
        arch.buscarMayorSalario();
        
        System.out.println("Ordenados:");
        arch.ordenarPorSalario();
    }
}