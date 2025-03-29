abstract public class Scuola {
    private String codice;
    private String denominazione;
    private String indirizzo;
    private String citta;
    private int numeroStudenti;
    private int numeroClassi;
    private int numeroSedi;
    private int numeroLaboratori;

    protected Scuola(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroSedi, int numeroLaboratori) {
        this.codice = codice;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.numeroStudenti = numeroStudenti;
        this.numeroClassi = numeroClassi;
        this.numeroSedi = numeroSedi;
        this.numeroLaboratori = numeroLaboratori;
    }

    public int getNumeroStudenti() {
        return numeroStudenti;
    }

    public int getNumeroSedi() {
        return numeroSedi;
    }

    public int getNumeroLaboratori() {
        return numeroLaboratori;
    }

    public int getNumeroClassi() {
        return numeroClassi;
    }
}