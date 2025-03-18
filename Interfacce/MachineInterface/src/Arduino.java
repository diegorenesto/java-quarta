public class Arduino extends ProgrammableDevice {

    private String linguaggioProgrammazione;

    protected Arduino(int id, int memoria, boolean bluetooth, String linguaggioProgrammazione) {
        super(id, memoria, bluetooth);
        this.linguaggioProgrammazione = linguaggioProgrammazione;
    }

    @Override
    public String toString() {
        return super.toString() + " , Linguaggio di programmazione" + linguaggioProgrammazione;
    }
}