public class Erbacee extends Pianta {
    private String sfumatura;
    private int spessore;

    public Erbacee(String codiceAlfanumerico, Tipologia tipologia, String colore, String mesePotatura, String meseFioritura, int prezzo, String sfumatura, int spessore) {
        super(codiceAlfanumerico, tipologia, colore, mesePotatura, meseFioritura, prezzo);
        this.sfumatura = sfumatura;
        this.spessore = spessore;
    }

    public String getSfumatura() {
        return sfumatura;
    }

    public int getSpessore() {
        return spessore;
    }

    @Override
    public String toString() {
        return super.toString() + " , Sfumatura: " + sfumatura + " , Spessore: " + spessore;
    }
}