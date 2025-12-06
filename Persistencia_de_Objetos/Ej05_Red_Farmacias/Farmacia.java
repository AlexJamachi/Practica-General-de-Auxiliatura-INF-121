package Ej05_Red_Farmacias;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private List<Medicamento> medicamentos;

    public Farmacia(String nombre, int suc, String dir) {
        this.nombreFarmacia = nombre;
        this.sucursal = suc;
        this.direccion = dir;
        this.medicamentos = new ArrayList<>();
    }

    public void addMedicamento(Medicamento m) { medicamentos.add(m); }
    public List<Medicamento> getMedicamentos() { return medicamentos; }
    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
    
    @Override
    public String toString() { return nombreFarmacia + " Suc:" + sucursal + " Dir:" + direccion; }
}