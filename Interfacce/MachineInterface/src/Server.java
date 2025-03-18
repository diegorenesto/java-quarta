public class Server extends ProgrammableDevice {

    private TipologiaOS tipologiaOS;

    protected Server(int id, int memoria, boolean bluetooth, TipologiaOS tipologiaOS) {
        super(id, memoria, bluetooth);
        this.tipologiaOS = tipologiaOS;
    }

    @Override
    public String toString() {
        return super.toString() + " , Tipologia Sistema Operativo: " + tipologiaOS;
    }
}