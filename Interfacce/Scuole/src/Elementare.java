public class Elementare extends Scuola implements Interface {

    public Elementare(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroSedi, int numeroLaboratori) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, numeroSedi, numeroLaboratori);
    }


    @Override
    public int contributoAnnuale() {
        return 125 * getNumeroStudenti() + 9000 * getNumeroSedi();
    }
}