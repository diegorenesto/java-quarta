public class Volo extends Viaggio {

    private String compagniaAerea;
    private int numeroVolo;
    private String aeroportoPartenza;
    private String aeroportoArrivo;
    private Classe classe;

    public Volo(String destinazione, int costo, int giorni, String compagniaAerea, int numeroVolo, String aeroportoPartenza, String aeroportoArrivo, Classe classe) {
        super(destinazione, costo, giorni);
        this.compagniaAerea = compagniaAerea;
        this.numeroVolo = numeroVolo;
        this.aeroportoPartenza = aeroportoPartenza;
        this.aeroportoArrivo = aeroportoArrivo;
        this.classe = classe;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    public int getNumeroVolo() {
        return numeroVolo;
    }

    public String getAereoportoPartenza() {
        return aeroportoPartenza;
    }

    public String getAereoportoArrivo() {
        return aeroportoArrivo;
    }

    public Classe getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return super.toString() + " , Compagnia aerea: " + compagniaAerea + " , Numero volo: " + numeroVolo + " , Partenza: " + aeroportoPartenza + " , Arrivo: " + aeroportoArrivo + " , Classe: " + classe;
    }
}