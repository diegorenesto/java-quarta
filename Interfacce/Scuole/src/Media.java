public class Media extends Scuola implements Interface {
    public Media(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroSedi, int numeroLaboratori) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, numeroSedi, numeroLaboratori);
    }

    @Override
    public int contributoAnnuale() {
        return 125 * getNumeroStudenti() + 1100 * getNumeroLaboratori() + 9000 * getNumeroSedi();
    }
}