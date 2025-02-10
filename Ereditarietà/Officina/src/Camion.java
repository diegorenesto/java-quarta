public class Camion extends Veicolo {

    private double carico;
    private int velocitaMax;

    public Camion(String marca, String modello, int prezzo, double carico, int velocitaMax, Carburante carburante) {
        super(marca, modello, prezzo, carburante);
        this.carico = carico;
        this.velocitaMax = velocitaMax;
    }

    @Override
    public String toString() {
        return "Camion: " + super.toString() + " - " + carico + " - " + velocitaMax;
    }
}
