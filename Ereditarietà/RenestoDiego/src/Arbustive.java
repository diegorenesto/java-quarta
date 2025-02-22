public class Arbustive extends Pianta {
    private int altezzaMax;

    public Arbustive(String codiceAlfanumerico, Tipologia tipologia, String colore, String mesePotatura, String meseFioritura, int prezzo, int altezzaMax) {
        super(codiceAlfanumerico, tipologia, colore, mesePotatura, meseFioritura, prezzo);
        this.altezzaMax = altezzaMax;
    }

    public int getAltezzaMax() {
        return altezzaMax;
    }

    @Override
    public String toString() {
        return super.toString() + " , Altezza massima: " + altezzaMax;
    }
}