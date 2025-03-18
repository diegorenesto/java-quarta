abstract public class ProgrammableDevice implements Machine {
    private int id;
    private int memoria;
    private boolean bluetooth;
    private boolean acceso = false;

    protected ProgrammableDevice(int id, int memoria, boolean bluetooth) {
        this.id = id;
        this.memoria = memoria;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Memoria: %d, Bluetooth: %s", id, memoria, bluetooth);
    }

    @Override
    public void accendi() {
        acceso = true;
        System.out.println("Dispositivo acceso");
    }

    @Override
    public void spegni() {
        if (acceso == false) {
            System.out.println("Dispositivo gia' spento");
        } else {
            acceso = false;
            System.out.println("Dispositivo spento");
        }
    }

    @Override
    public boolean isOn() {
        return acceso;
    }
}