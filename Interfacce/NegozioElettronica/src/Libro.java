abstract public class Libro implements Prodotto {
    private String nome;
    private String descrizione;
    private String autore;
    private int isbn;
    private int prezzo;
    private int quantita;

    public Libro(String nome, String descrizione, String autore, int isbn, int prezzo, int quantita) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.isbn = isbn;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Descrizione: %s, Autore: %s, ISBN: %d, Prezzo: %d, Quantita: %d", nome, descrizione, autore, isbn, prezzo, quantita);
    }
}