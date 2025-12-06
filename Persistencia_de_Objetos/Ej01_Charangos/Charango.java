package Ej01_Charangos;

public class Charango {
    private String material;
    private int nroCuerdas;
    private boolean[] cuerdas;

    public Charango(String material, int nroCuerdas, boolean[] cuerdas) {
        this.material = material;
        this.nroCuerdas = nroCuerdas;
        this.cuerdas = cuerdas;
    }

    public String getMaterial() {
        return material;
    }

    public int getNroCuerdas() {
        return nroCuerdas;
    }

    public boolean[] getCuerdas() {
        return cuerdas;
    }

    public int contarCuerdasFalsas() {
        int count = 0;
        for (boolean b : cuerdas) {
            if (!b) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Charango{material='" + material + "', nroCuerdas=" + nroCuerdas + "}";
    }
}