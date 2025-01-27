import java.util.Objects;

public class Dipendente {

    // nominativo, genere, indirizzo, incentivo
    private String nominativo;
    private final char genere;
    private String indirizzo;
    private final double incentivo = 0.50;

    public Dipendente(String nominativo, char genere, String indirizzo) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.indirizzo = indirizzo;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public char getGenere() {
        return genere;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    @Override
    public String toString() {
        return String.format("%s - %c - %s - %f", nominativo, genere, indirizzo, incentivo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        Dipendente dipendente = (Dipendente) o;
        return nominativo.equals(dipendente.nominativo);
    }

}