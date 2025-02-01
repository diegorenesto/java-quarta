public class Server extends PcFisso {
    private int numeroProcessori;
    private boolean Raid; // se ha il disco di tipo RAID

    public Server(String processore, int dimRAM, int dimMemMassa, String marca, String modello, String os, String tipoContenitore, int numeroProcessori, boolean RAID) {
        super(processore, dimRAM, dimMemMassa, marca, modello, os, tipoContenitore);
        this.numeroProcessori = numeroProcessori;
        this.Raid = RAID;
    }

    public int getNumeroProcessori() {
        return numeroProcessori;
    }

    public boolean isRaid() {
        return Raid;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero Processori: " + numeroProcessori + ", RAID: " + Raid;
    }
}