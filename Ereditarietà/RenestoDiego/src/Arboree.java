public class Arboree extends Arbustive {

    private int superficie;

    public Arboree(String codiceAlfanumerico, Tipologia tipologia, String colore, String mesePotatura, String meseFioritura, int prezzo, int altezzaMax, int superficie) {
        super(codiceAlfanumerico, tipologia, colore, mesePotatura, meseFioritura, prezzo, altezzaMax);
        this.superficie = superficie;
    }

    public int getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return super.toString() + " , Superficie: " + superficie;
    }
}