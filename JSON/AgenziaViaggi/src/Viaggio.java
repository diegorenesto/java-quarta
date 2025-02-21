import java.util.Objects;

public class Viaggio {
    private String destinazione;
    private int costo;
    private int giorni;

    public Viaggio(String destinazione, int costo, int giorni) {
        this.destinazione = destinazione;
        this.costo = costo;
        this.giorni = giorni;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public int getCosto() {
        return costo;
    }

    public int getGiorni() {
        return giorni;
    }

    @Override
    public String toString() {
        return String.format("Destinazione: %s, Costo: %d, Giorni: %s", destinazione, costo, giorni);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Viaggio viaggio = (Viaggio) o;
        return costo == viaggio.costo && giorni == viaggio.giorni && destinazione.equals(((Viaggio) o).destinazione);
    }
}