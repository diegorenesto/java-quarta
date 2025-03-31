/**
 * @author Diego Renesto
 * @version 1.0
 * @since 31/03/2025
 */
abstract public class ProdottoElettronico implements Cloneable, Prodotto {

    private int codiceProdotto;
    private String marca;
    private int prezzo;

    /**
     * metodo costruttore di ProdottoElettronico
     * @param codiceProdotto
     * @param marca
     * @param prezzo
     */
    protected ProdottoElettronico(int codiceProdotto, String marca, int prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    /**
     * ritorna il codice del prodotto
     * @return int
     */
    @Override
    public int getCodice() {
        return codiceProdotto;
    }

    /**
     * modifica il prezzo del prodotto
     * @param prezzo
     */
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Codice Prodotto: %d, Marca: %s, Prezzo: %d", codiceProdotto, marca, prezzo);
    }

    /**
     * clona un ProdottoElettronico
     *
     * @return ProdottoElettronico
     * @throws CloneNotSupportedException
     */
    @Override
    protected ProdottoElettronico clone() throws CloneNotSupportedException {
        return (ProdottoElettronico) super.clone();
    }

    /**
     * confronta due prodotti
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdottoElettronico p = (ProdottoElettronico) o;
        return codiceProdotto == p.codiceProdotto;
    }
}