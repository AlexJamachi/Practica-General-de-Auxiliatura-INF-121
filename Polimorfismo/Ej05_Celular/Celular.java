package Polimorfismo.Ej05_Celular;
public class Celular {
    private String nroTel;
    private String dueno;
    private float espacioGb;
    private float ramGb;
    private int nroApp;
    public Celular(String nroTel, String dueno, float espacioGb, float ramGb, int nroApp) {
        this.nroTel = nroTel;
        this.dueno = dueno;
        this.espacioGb = espacioGb;
        this.ramGb = ramGb;
        this.nroApp = nroApp;
    }
    public void mostrar() {
        System.out.println("--- Celular de " + this.dueno + " ---");
        System.out.println("Número: " + this.nroTel);
        System.out.println("Espacio: " + this.espacioGb + " GB");
        System.out.println("RAM: " + this.ramGb + " GB");
        System.out.println("Nro. de Apps: " + this.nroApp);
        System.out.println("-------------------------" + "-".repeat(this.dueno.length()));
    }
    public void aumentarNroApp() {
        this.nroApp += 10;
    }
    public void disminuirEspacio() {
        this.espacioGb -= 5;
    }
    public static void main(String[] args) {
        Celular miCelular = new Celular("77712345", "Juan Perez", 128.0f, 8.0f, 50);
        System.out.println("--- Estado Inicial ---");
        miCelular.mostrar();
        System.out.println("\n>>> Aplicando método para aumentar apps...");
        miCelular.aumentarNroApp();       
        System.out.println("\n--- Estado Intermedio ---");
        miCelular.mostrar();
        System.out.println("\n>>> Aplicando método para disminuir espacio...");
        miCelular.disminuirEspacio();
        System.out.println("\n--- Estado Final ---");
        miCelular.mostrar();
    }
}