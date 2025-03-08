package backend;

abstract public class Libro implements Cloneable {
    private String autore;
    private String titolo;
    private int nPagine;
    private Genere genere;

    protected Libro(String autore, String titolo, int nPagine, Genere genere) {
        this.autore = autore;
        this.titolo = titolo;
        this.nPagine = nPagine;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getnPagine() {
        return nPagine;
    }

    public Genere getGenere() {
        return genere;
    }

    abstract public double calcolaPrezzo();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return autore.equals(libro.autore) && titolo.equals(libro.titolo);
    }

    @Override
    public String toString() {
        return String.format("Autore: %s, Titolo: %s, Numero Pagine: %d, backend.Genere: %s", autore, titolo, nPagine, genere);
    }

    @Override
    protected Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }
}