public class Superiore extends Scuola implements Interface {
    private Tipologia tipologia;

    public Superiore(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroSedi, int numeroLaboratori, Tipologia tipologia) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, numeroSedi, numeroLaboratori);
        this.tipologia = tipologia;
    }

    @Override
    public int contributoAnnuale() {
        if (tipologia.equals(Tipologia.LICEO))
            return 125 * getNumeroStudenti() + 1100 * getNumeroLaboratori();
        else if (tipologia.equals(Tipologia.TECNICO))
            return 3500 * getNumeroClassi() + 6000 * getNumeroLaboratori();
        else if (tipologia.equals(Tipologia.PROFESSIONALE))
            return 2400 * getNumeroClassi() + 3000 * getNumeroLaboratori();
        return 0; // uscita con errore
    }
}