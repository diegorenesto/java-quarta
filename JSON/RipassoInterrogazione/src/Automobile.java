public class Automobile extends Veicolo {

    private int nPorte;

    public Automobile(String marca, String modello, int prezzo, Carburante carburante, int nPorte) {
        super(marca, modello, prezzo, carburante);
        this.nPorte = nPorte;
    }

    public int getnPorte() {
        return nPorte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero porte: " + nPorte;
    }
}