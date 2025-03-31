/**
 * @author Diego Renesto
 * @version 1.0
 * @since 31/03/2025
 */
public class Smartphone extends ProdottoElettronico {

    private String modello;
    private int memoria;

    /**
     * metodo costruttore di Smartphone
     *
     * @param codiceProdotto
     * @param marca
     * @param prezzo
     * @param modello
     * @param memoria
     */
    public Smartphone(int codiceProdotto, String marca, int prezzo, String modello, int memoria) {
        super(codiceProdotto, marca, prezzo);
        this.modello = modello;
        this.memoria = memoria;
    }

    /**
     * metodo toString della classe Smartphone
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", Memoria: " + memoria;
    }
}