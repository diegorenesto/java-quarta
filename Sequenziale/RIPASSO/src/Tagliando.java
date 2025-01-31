import java.time.LocalDate;

public class Tagliando {
    public int id_tagliando;
    public Interventi interventi;
    public int costo;
    public LocalDate data;

    @Override
    public String toString() {
        return String.format("Id Tagliando: %s, Intervento: %s, Costo: %d, Data: %s", id_tagliando, interventi, costo, data);
    }
}