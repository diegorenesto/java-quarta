public class Moto extends Veicolo {

    private int cilindrata;

    public Moto(String marca, String modello, int prezzo, int cilindrata) {
        super(marca, modello, prezzo);
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + cilindrata;
    }
}
