abstract public class ProgrammableDevice implements Machine {
    private int id;
    private int memoria;
    private boolean bluetooth;

    protected ProgrammableDevice(int id, int memoria, boolean bluetooth) {
        this.id = id;
        this.memoria = memoria;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Memoria: %d, Bluetooth: %s", id, memoria, bluetooth);
    }
}