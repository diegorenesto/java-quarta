package backend;

public class Thriller extends Libro {

    private boolean serieTv;

    public Thriller(String autore, String titolo, int nPagine, Genere genere, boolean serieTv) {
        super(autore, titolo, nPagine, genere);
        this.serieTv = serieTv;
    }

    @Override
    public double calcolaPrezzo() {
        return getnPagine() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Serie tv: " + serieTv;
    }
}