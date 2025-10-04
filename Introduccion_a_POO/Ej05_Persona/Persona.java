package Introduccion_a_POO.Ej05_Persona;
public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;
    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    public void mostrarDatos() {
        System.out.println("--- Datos de la Persona ---");
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
        System.out.println("---------------------------");
    }
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("Edad inválida.");
        }
    }
    public String getPaterno() {
        return this.paterno;
    }   
    public String getNombre() {
        return this.nombre;
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", "Quispe", "Mendoza", 25, "1234567 LP");
        Persona persona2 = new Persona("Carlos", "Quispe", "Rojas", 17, "7654321 CB");
        System.out.println("Instancias creadas:");
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        System.out.println("\n¿" + persona1.getNombre() + " es mayor de edad? " + (persona1.esMayorDeEdad() ? "Sí" : "No"));
        System.out.println("¿" + persona2.getNombre() + " es mayor de edad? " + (persona2.esMayorDeEdad() ? "Sí" : "No"));
        System.out.println("\nModificando la edad de Carlos a 18...");
        persona2.modificarEdad(18);
        System.out.println("¿" + persona2.getNombre() + " es ahora mayor de edad? " + (persona2.esMayorDeEdad() ? "Sí" : "No"));
        persona2.mostrarDatos();
        System.out.println("\nVerificando apellidos paternos...");
        if (persona1.getPaterno().equals(persona2.getPaterno())) {
            System.out.println("Las dos personas tienen el mismo apellido paterno.");
        } else {
            System.out.println("Las dos personas tienen apellidos paternos diferentes.");
        }
    }
}