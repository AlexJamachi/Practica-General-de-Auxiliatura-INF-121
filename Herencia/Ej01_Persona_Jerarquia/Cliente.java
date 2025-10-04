package Herencia.Ej01_Persona_Jerarquia;
public class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;
    public Cliente(String nombre, String apellido, String ci, String idCliente, String nroCompra) {
        super(nombre, apellido, ci);
        this.idCliente = idCliente;
        this.nroCompra = nroCompra;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("--- Datos del Cliente ---");
        super.mostrarDatos();
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Nro. Compra: " + nroCompra);
        System.out.println("-------------------------");
    }
}