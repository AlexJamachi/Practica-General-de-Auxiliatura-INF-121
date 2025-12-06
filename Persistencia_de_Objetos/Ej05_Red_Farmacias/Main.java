package Ej05_Red_Farmacias;

public class Main {
    public static void main(String[] args) {
        ArchFarmacia af = new ArchFarmacia();
        Farmacia f1 = new Farmacia("FarmaCorp", 1, "Av. Arce");
        f1.addMedicamento(new Medicamento("Tapsin", "Resfrio", 5.0));
        f1.addMedicamento(new Medicamento("Jarabe", "Tos", 20.0));
        
        Farmacia f2 = new Farmacia("FarmaCorp", 2, "El Prado");
        
        af.adicionar(f1);
        af.adicionar(f2);
        
        af.mostrarTosSucursal(1);
        af.moverMedicamentos("Tos", 1, 2);
    }
}