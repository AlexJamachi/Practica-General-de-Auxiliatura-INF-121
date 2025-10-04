package Herencia.Ej01_Persona_Jerarquia;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carla", "Sosa", "1234567", "CLI-001", "COMP-987");
        Jefe jefe1 = new Jefe("Roberto", "Mendez", "7654321", "Central La Paz", "Gerente General");        
        cliente1.mostrarDatos();
        jefe1.mostrarDatos();
    }
}