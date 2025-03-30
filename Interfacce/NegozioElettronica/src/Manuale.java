public class Manuale extends Libro implements Cloneable {
    private String argomento;

    public Manuale(String nome, String descrizione, String autore, int isbn, int prezzo, int quantita, String argomento) {
        super(nome, descrizione, autore, isbn, prezzo, quantita);
        this.argomento = argomento;
    }

    @Override
    public String toString() {
        return super.toString() + " , Argomento: " + argomento;
    }
}