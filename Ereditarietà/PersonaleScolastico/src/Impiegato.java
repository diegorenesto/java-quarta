public class Impiegato extends Dipendente {

    private String ufficio;

    public Impiegato(String nominativo, char genere, String indirizzo, String ufficio) {
        super(nominativo, genere, indirizzo);
        this.ufficio = ufficio;
    }

    public String getUfficio() {
        return ufficio;
    }

    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }

    @Override
    public double getIncentivo() {
        return super.getIncentivo() * 3;
    }
}