/**
 * @author Diego Renesto
 * @version 1.0
 * @since 31/03/2025
 */
public class Manuale extends Libro {
    private String argomento;

    /**
     * metodo costruttore di Manuale
     *
     * @param nome
     * @param descrizione
     * @param autore
     * @param isbn
     * @param prezzo
     * @param quantita
     * @param argomento
     */
    public Manuale(String nome, String descrizione, String autore, int isbn, int prezzo, int quantita, String argomento) {
        super(nome, descrizione, autore, isbn, prezzo, quantita);
        this.argomento = argomento;
    }

    /**
     * metodo toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + " , Argomento: " + argomento;
    }
}