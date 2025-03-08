package backend;

public class Manuale extends Libro {

    private String argomento;
    private Livello livello;

    public Manuale(String autore, String titolo, int nPagine, Genere genere, String argomento, Livello livello) {
        super(autore, titolo, nPagine, genere);
        this.argomento = argomento;
        this.livello = livello;
    }

    public String getArgomento() {
        return argomento;
    }

    @Override
    public double calcolaPrezzo() {
        return getnPagine() * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() + ", Argomento: " + argomento + ", backend.Livello: " + livello + ", Prezzo: " + calcolaPrezzo();
    }

}