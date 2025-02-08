package backend;

public class Romanzo extends Libro {

    private GenereLetterario genereLetterario;

    public Romanzo(String autore, String titolo, int nPagine, GenereLetterario genereLetterario) {
        super(autore, titolo, nPagine);
        this.genereLetterario = genereLetterario;
    }
    @Override
    public String stampaLibro() {
        return super.stampaLibro() + ", Genere letterario: " + genereLetterario;
    }

}
