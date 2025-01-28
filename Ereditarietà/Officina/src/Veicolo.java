public class Veicolo {

    private String marca;
    private String modello;
    private int prezzo;

    public Veicolo(String marca, String modello, int prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
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

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", marca, modello, prezzo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        Veicolo v = (Veicolo) o;
        return marca.equals(v.marca) && modello.equals(v.modello);
    }

}