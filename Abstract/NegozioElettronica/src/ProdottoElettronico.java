abstract public class ProdottoElettronico implements Cloneable {
    private int codiceProdotto;
    private String marca;
    private int prezzo;

    protected ProdottoElettronico(int codiceProdotto, String marca, int prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return String.format("Codice Prodotto: %d, Marca: %s, Prezzo: %d", codiceProdotto, marca, prezzo);
    }

    @Override
    protected ProdottoElettronico clone() throws CloneNotSupportedException {
        return (ProdottoElettronico) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdottoElettronico p = (ProdottoElettronico) o;
        return codiceProdotto == p.codiceProdotto;
    }
}