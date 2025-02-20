public class Libro {
    private String autore;
    private String titolo;

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public Libro(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }
}