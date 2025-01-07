import java.util.Objects;

public class Libro {

    private String autore;
    private String titolo;
    private int numeroPagine;
    private double prezzoPagine;
    private Genere tipo;

    public Libro(String autore, String titolo, int numeroPagine, Genere tipo) {
        this.autore = autore;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.tipo = tipo;
    }

    public Libro(Libro l) {
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

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public double getPrezzoPagine() {
        return prezzoPagine;
    }

    @Override
    public String toString() {
        return String.format("Autore: %s, Titolo: %s, Numero Pagine: %d, Tipo: %s", autore, titolo, numeroPagine, tipo);
    }

//    @Override
//    public boolean equals(Object o){
//        if(o instanceof Libro)
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return numeroPagine == libro.numeroPagine && Objects.equals(autore, libro.autore) && Objects.equals(titolo, libro.titolo) && tipo == libro.tipo;
    }
}