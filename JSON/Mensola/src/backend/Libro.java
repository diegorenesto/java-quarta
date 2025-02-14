package backend;

public class Libro {
    private String autore;
    private String titolo;
    private int nPagine;
    private final double costoPagine = 0.05;

    public Libro(String autore, String titolo, int nPagine) {
        this.autore = autore;
        this.titolo = titolo;
        this.nPagine = nPagine;
    }

    public Libro(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
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

    public double getCostoPagine() {
        return costoPagine;
    }

    @Override
    public boolean equals(Object o) {
        Libro book;
        if (!(o instanceof Libro libro)) return false;
        book = (Libro) o;
        return book.autore.equals(autore) && book.titolo.equals(titolo);
    }

    public String stampaLibro() {
        return String.format("Autore: %s, Titolo: %s, Numero Pagine: %d, Costo: %f", autore, titolo, nPagine, costoPagine * nPagine);
    }

}