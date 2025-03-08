package backend;

public class Romanzo extends Libro {

    private GenereLetterario genereLetterario;

    public Romanzo(String autore, String titolo, int nPagine, Genere genere, GenereLetterario genereLetterario) {
        super(autore, titolo, nPagine, genere);
        this.genereLetterario = genereLetterario;
    }

    @Override
    public double calcolaPrezzo() {
        return getnPagine() * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genere letterario: " + genereLetterario + ", Prezzo: " + calcolaPrezzo();
    }
}