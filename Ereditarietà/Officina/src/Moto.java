public class Moto extends Veicolo {

    private int cilindrata;

    public Moto(String marca, String modello, int prezzo, int cilindrata, Carburante carburante) {
        super(marca, modello, prezzo, carburante);
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        return "Moto: " + super.toString() + " - " + cilindrata;
    }
}
