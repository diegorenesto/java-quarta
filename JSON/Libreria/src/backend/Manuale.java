package backend;

public class Manuale extends Libro {

    private String argomento;
    private Livello livello;

    public Manuale(String autore, String titolo, int nPagine, String argomento, Livello livello) {
        super(autore, titolo, nPagine);
        this.argomento = argomento;
        this.livello = livello;
    }

    public String getArgomento() {
        return argomento;
    }

    @Override
    public String stampaLibro() {
        return super.stampaLibro() + ", Argomento: " + argomento + ", livello: " + livello;
    }
}