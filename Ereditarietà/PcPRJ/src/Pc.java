import java.util.Objects;

public class Pc {
    private String processore;
    private int dimRAM;
    private int dimMemMassa;
    private String marca;
    private String modello;
    private String os;

    public Pc(String processore, int dimRAM, int dimMemMassa, String marca, String modello, String os) {
        this.processore = processore;
        this.dimRAM = dimRAM;
        this.dimMemMassa = dimMemMassa;
        this.marca = marca;
        this.modello = modello;
        this.os = os;
    }

    public String getProcessore() {
        return processore;
    }

    public int getDimRAM() {
        return dimRAM;
    }

    public int getDimMemMassa() {
        return dimMemMassa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return String.format("Processore: %s, Dimensione RAM: %d, Dimensione Memoria di massa: %d, Marca: %s, Modello: %s, Sistema Operativo: %s", processore, dimRAM, dimMemMassa, marca, modello, os);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pc pc = (Pc) o;
        return dimRAM == pc.dimRAM &&
                dimMemMassa == pc.dimMemMassa &&
                Objects.equals(processore, pc.processore) &&
                Objects.equals(marca, pc.marca) &&
                Objects.equals(modello, pc.modello) &&
                Objects.equals(os, pc.os);
    }

}