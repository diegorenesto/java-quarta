// Classe Tablet
class Tablet {
    private String marcaCpu;
    private int identifier;
    private int spazioRam;
    private Stato statoTablet;

    public Tablet(String marcaCpu, int identifier, int spazioRam, Stato statoTablet) {
        this.marcaCpu = marcaCpu;
        this.identifier = identifier;
        this.spazioRam = spazioRam;
        this.statoTablet = statoTablet;
    }

    public String getMarcaCpu() {
        return marcaCpu;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getSpazioRam() {
        return spazioRam;
    }

    public Stato getStatoTablet() {
        return statoTablet;
    }

    public void setStatoTablet(Stato statoTablet) {
        this.statoTablet = statoTablet;
    }

    @Override
    public String toString() {
        return String.format("Tablet: Marca = %s, ID = %d, RAM = %d GB, Stato = %s", marcaCpu, identifier, spazioRam, statoTablet);
    }
}