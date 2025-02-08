package backend;

import java.util.Objects;

public class Libro {
    private String autore;
    private String titolo;
    private int nPagine;

    private final double costoPagine = 0.05;

    Genere tipo;


    public Libro(String autore, String titolo, int nPagine) {
        this.autore = autore;
        this.titolo = titolo;
        this.nPagine = nPagine;
//        this.tipo = tipo;
    }

    public Libro(Libro l) {
        this.autore = l.autore;
        this.titolo = l.titolo;
        this.nPagine = l.nPagine;
        this.tipo = l.tipo;
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
        return String.format("Autore: %s Titolo: %s Numero Pagine: %d Costo: %f", autore, titolo, nPagine, costoPagine * nPagine);
    }

}