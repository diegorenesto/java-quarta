public class PcFisso extends Pc {
    private String tipoContenitore;

    public PcFisso(String processore, int dimRAM, int dimMemMassa, String marca, String modello, String os, String tipoContenitore) {
        super(processore, dimRAM, dimMemMassa, marca, modello, os);
        this.tipoContenitore = tipoContenitore;
    }

    public String getTipoContenitore() {
        return tipoContenitore;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contenitore: " + tipoContenitore;
    }
}