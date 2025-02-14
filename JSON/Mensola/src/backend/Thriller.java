package backend;

public class Thriller extends Libro {

    private boolean serieTv;

    public Thriller(String autore, String titolo, int nPagine, boolean serieTv) {
        super(autore, titolo, nPagine);
        this.serieTv = serieTv;
    }

    @Override
    public String stampaLibro() {
        return super.stampaLibro() + ", Serie tv: " + serieTv;
    }

}