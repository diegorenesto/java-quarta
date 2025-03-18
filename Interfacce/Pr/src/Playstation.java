public class Playstation extends ProgrammableDevice {
    private TipologiaPlay tipologiaPlay;
    private boolean conLettore;

    protected Playstation(int id, int memoria, boolean bluetooth, TipologiaPlay tipologiaPlay, boolean conLettore) {
        super(id, memoria, bluetooth);
        this.tipologiaPlay = tipologiaPlay;
        this.conLettore = conLettore;
    }

    @Override
    public String toString() {
        return super.toString() + " , Tipologia Play: %s" + tipologiaPlay + " , Con Lettore: %s" + conLettore;
    }
}