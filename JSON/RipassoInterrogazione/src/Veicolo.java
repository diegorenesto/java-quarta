public class Veicolo {
    private String marca;
    private String modello;
    private int prezzo;
    private Carburante carburante;

    public Veicolo(String marca, String modello, int prezzo, Carburante carburante) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.carburante = carburante;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public Carburante getCarburante() {
        return carburante;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s, Modello: %s, Prezzo: %d, Carburante: %s", marca, modello, prezzo, carburante);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Veicolo)) return false;
        Veicolo veicolo = (Veicolo) o;
        return marca.equals(veicolo.marca) && modello.equals(veicolo.modello);
    }
}