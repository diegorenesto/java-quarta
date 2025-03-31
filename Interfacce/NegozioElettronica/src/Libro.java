/**
 * @author Diego Renesto
 * @version 1.0
 * @since 31/03/2025
 */
abstract public class Libro implements Prodotto, Cloneable {
    private String nome;
    private String descrizione;
    private String autore;
    private int isbn;
    private int prezzo;
    private int quantita;

    /**
     * metodo costruttore di Libro
     *
     * @param nome
     * @param descrizione
     * @param autore
     * @param isbn
     * @param prezzo
     * @param quantita
     */
    public Libro(String nome, String descrizione, String autore, int isbn, int prezzo, int quantita) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.isbn = isbn;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    /**
     * ritorna l'isbn del Libro
     *
     * @return int
     */
    @Override
    public int getCodice() {
        return isbn;
    }

    /**
     * metodo toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Nome: %s, Descrizione: %s, Autore: %s, ISBN: %d, Prezzo: %d, Quantita: %d", nome, descrizione, autore, isbn, prezzo, quantita);
    }

    /**
     * clona un Libro
     *
     * @return Libro
     * @throws CloneNotSupportedException
     */
    @Override
    protected Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }
}