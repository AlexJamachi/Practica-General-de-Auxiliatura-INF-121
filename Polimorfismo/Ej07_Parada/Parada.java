package Polimorfismo.Ej07_Parada;
public class Parada {
    private String nombreP;
    private String[] admins;
    private String[][] autos;
    private int nroAdmins;
    private int nroAutos;
    private static final int MAX_ADMINS = 10;
    private static final int MAX_AUTOS = 10;
    public Parada() {
        this.nombreP = "Parada por Defecto";
        this.admins = new String[MAX_ADMINS];
        this.autos = new String[MAX_AUTOS][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }
    public Parada(String nombreP) {
        this.nombreP = nombreP;
        this.admins = new String[MAX_ADMINS];
        this.autos = new String[MAX_AUTOS][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }
    public void adicionar(String admin) {
        if (this.nroAdmins < MAX_ADMINS) {
            this.admins[this.nroAdmins] = admin;
            this.nroAdmins++;
            System.out.println("Admin '" + admin + "' añadido.");
        } else {
            System.out.println("No se pueden añadir más admins.");
        }
    }
    public void adicionar(String modelo, String conductor, String placa) {
        if (this.nroAutos < MAX_AUTOS) {
            this.autos[this.nroAutos][0] = modelo;
            this.autos[this.nroAutos][1] = conductor;
            this.autos[this.nroAutos][2] = placa;
            this.nroAutos++;
            System.out.println("Auto con placa '" + placa + "' añadido.");
        } else {
            System.out.println("No se pueden añadir más autos.");
        }
    }
    public void mostrar() {
        System.out.println("\n--- " + this.nombreP + " ---");
        System.out.println("Administradores (" + this.nroAdmins + "/" + MAX_ADMINS + "):");
        if (nroAdmins == 0) {
            System.out.println("  (Ninguno)");
        } else {
            for (int i = 0; i < nroAdmins; i++) {
                System.out.println("  - " + this.admins[i]);
            }
        }  
        System.out.println("Autos (" + this.nroAutos + "/" + MAX_AUTOS + "):");
        if (nroAutos == 0) {
            System.out.println("  (Ninguno)");
        } else {
            for (int i = 0; i < nroAutos; i++) {
                System.out.println("  - Modelo: " + autos[i][0] + ", Conductor: " + autos[i][1] + ", Placa: " + autos[i][2]);
            }
        }
    }
    public static void main(String[] args) {
        Parada paradaDefecto = new Parada();
        Parada paradaNombre = new Parada("Parada de San Pedro");
        paradaDefecto.adicionar("Luis Garcia");
        paradaDefecto.adicionar("Toyota Corolla", "Ana Flores", "2468ABC");
        paradaDefecto.adicionar("Nissan Sentra", "Juan Quispe", "1357XYZ");
        paradaDefecto.mostrar();
        paradaNombre.mostrar();
    }
}