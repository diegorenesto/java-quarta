public class Camion extends Veicolo {

    private double carico;
    private Carburante carburante;
    private int velocitaMax;

    public Camion(String marca, String modello, int prezzo, double carico, Carburante carburante, int velocitaMax) {
        super(marca, modello, prezzo);
        this.carico = carico;
        this.carburante = carburante;
        this.velocitaMax = velocitaMax;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + carico + " - " + carburante + " - " + velocitaMax;
    }
}