public class PcPortatile extends Pc {
    private double peso;
    private double altezza, larghezza, profondita;
    private double dimensioniVideo;

    public PcPortatile(String processore, int dimRAM, int dimMemMassa, String marca, String modello, String os, double peso, double altezza, double larghezza, double profondita, double dimensioniVideo) {
        super(processore, dimRAM, dimMemMassa, marca, modello, os);
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.dimensioniVideo = dimensioniVideo;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensioniVideo() {
        return dimensioniVideo;
    }

    public String toString() {
        return super.toString() + ", Peso: " + peso + ", Dimensioni video: " + dimensioniVideo;
    }
}