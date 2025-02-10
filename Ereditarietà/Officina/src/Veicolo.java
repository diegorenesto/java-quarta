import java.util.Objects;

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

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Veicolo: " + String.format("%s - %s - %d - %s", marca, modello, prezzo, carburante);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return Objects.equals(marca, veicolo.marca) && Objects.equals(modello, veicolo.modello);
    }

}
