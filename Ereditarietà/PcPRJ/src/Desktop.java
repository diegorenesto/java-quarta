public class Desktop extends PcFisso {
    private String tipoSchedaVideo;

    public Desktop(String processore, int dimRAM, int dimMemMassa, String marca, String modello, String os, String tipoContenitore, String tipoSchedaVideo) {
        super(processore, dimRAM, dimMemMassa, marca, modello, os, tipoContenitore);
        this.tipoSchedaVideo = tipoSchedaVideo;
    }

    public String getTipoSchedaVideo() {
        return tipoSchedaVideo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Scheda video: " + tipoSchedaVideo;
    }
}