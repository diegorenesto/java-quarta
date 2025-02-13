import java.util.Objects;

public class Libro {
    private String autore;
    private String titolo;

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

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return autore.equals(libro.autore) && titolo.equals(libro.titolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autore, titolo);
    }

    @Override
    public String toString() {
        return String.format("Autore: %s, Titolo: %s", autore, titolo);
    }
}